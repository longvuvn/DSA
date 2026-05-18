# Buổi 04: Kết quả

## Thực hành

### Bài 1: Kiểm tra ngoặc hợp lệ

- Ý tưởng: dùng stack, push mở, pop khi gặp đóng.
- Input: `({[]})` → Output: `true`.
- Input: `([)]` → Output: `false`.

### Bài 2: Queue bằng 2 stack

- Ý tưởng: stackIn để enqueue, stackOut để dequeue.
- Output mẫu: enqueue 1,2,3 → dequeue → `1`.

## Bài tập

1. **Đảo chuỗi bằng stack**
   - Input: `"abc"` → Output: `"cba"`.

2. **Mô phỏng hàng đợi**
   - Ý tưởng: dùng array/linked list với front/rear.
   - Output mẫu: enqueue 5,6 → dequeue → `5`.

3. **Sliding window maximum**
   - Input: `[1,3,-1,-3,5,3,6,7]`, k=3
   - Output: `[3,3,5,5,6,7]`.

4. **Min Stack**
   - Ý tưởng: stack phụ lưu min hiện tại.
   - Output mẫu: push 5,2,7 → getMin → `2`.
