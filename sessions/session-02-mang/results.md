# Buổi 02: Kết quả

## Thực hành

### Bài 1: Cài đặt mảng động

- Ý tưởng: mảng gốc size=4, khi đầy thì tạo mảng mới size=8 và copy.
- Output mẫu: thêm 5 phần tử → `size=5`, `capacity=8`.

### Bài 2: Xoay mảng

- Ý tưởng: reverse toàn mảng, reverse 0..k-1, reverse k..n-1.
- Input: `[1,2,3,4,5,6]`, k=2
- Output: `[5,6,1,2,3,4]`.

## Bài tập

1. **Tìm vị trí phần tử nhỏ nhất**
   - Input: `[4,2,7,2]` → Output: `1` (vị trí đầu tiên).

2. **Gộp 2 mảng đã sắp xếp**
   - Input: `[1,3,5]` và `[2,4,6]`
   - Output: `[1,2,3,4,5,6]`.

3. **Kadane – subarray lớn nhất**
   - Input: `[-2,1,-3,4,-1,2,1,-5,4]`
   - Output: `6` (subarray `[4,-1,2,1]`).

4. **Xóa trùng lặp mảng đã sắp xếp**
   - Input: `[1,1,2,2,3]`
   - Output: `[1,2,3]`.
