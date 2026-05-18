# Buổi 03: Kết quả

## Thực hành

### Bài 1: Singly Linked List

- Ý tưởng: dùng class Node, thao tác trên head.
- Output mẫu:
  - insertHead(2), insertTail(3) → `2 -> 3`
  - deleteValue(2) → `3`
  - find(3) → `true`.

### Bài 2: Đảo linked list

- Ý tưởng: 3 con trỏ `prev, cur, next`.
- Input: `1 -> 2 -> 3 -> 4`
- Output: `4 -> 3 -> 2 -> 1`.

## Bài tập

1. **Đếm số node**
   - Input: `1->2->3` → Output: `3`.

2. **Tìm node giữa**
   - Ý tưởng: slow/fast pointer.
   - Input: `1->2->3->4->5` → Output: `3`.

3. **Phát hiện vòng lặp (Floyd)**
   - Input: `1->2->3->2` → Output: `true`.

4. **Gộp hai list đã sắp xếp**
   - Input: `[1,3,5]` và `[2,4,6]`
   - Output: `[1,2,3,4,5,6]`.
