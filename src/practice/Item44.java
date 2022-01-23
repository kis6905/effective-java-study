package practice;

import java.util.function.Supplier;

public class Item44 {

	public static void main(String[] args) {
		CacheService cacheService = new CacheService();
		
		User user = new User();
		cacheService.put(user.getUserId(), user, user::calculateTtl);
	}
}

class User {
	private String userId;
	private String name;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long calculateTtl() {
		// ttl 계산
		return 1L;
	}
}

class CacheService {
	
	// 표준 함수형 인터페이스 사용 예
	public void put(String key, Object value, Supplier<Long> ttlSupplier) {
		Long ttl = ttlSupplier.get();
		System.out.println("ttl: " + ttl);
	}
	
}

