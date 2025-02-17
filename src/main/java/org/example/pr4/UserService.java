package org.example.pr4;

public class UserService {
    private final UserRepository userRepository;

    // 생성자 주입
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser (String userId, String password) {
        // 유효성 검사, 비즈니스 로직 등 추가
        // 로직등을 통과한다면 저장
        userRepository.saveUser(userId,password);
        System.out.println("사용자 [" + userId + "] 등록 완료.");
    }

    public String findPassword(String userId) {
        return userRepository.getUserPassword(userId);
    }

}
