# Buổi 01: Kết quả

## Thực hành

### Bài 1: Phân tích độ phức tạp

- Ý tưởng: viết 3 đoạn code và phân tích số vòng lặp.
  - 1 vòng lặp: $O(n)$.
  - 2 vòng lặp lồng nhau: $O(n^2)$.
  - Giảm $n$ xuống $n/2$: $O(log n)$.
- Output mẫu (n=5):
  - Vòng 1: in 5 dòng.
  - Vòng 2: in 25 dòng.
  - Vòng 3: in 3 dòng (n=5 → 2 → 1 → 0).

### Bài 2: Đếm số cặp bằng nhau

- Ý tưởng: dùng Hash Map lưu tần suất; mỗi lần gặp phần tử x thì cộng `freq[x]` vào đáp án.
- Input mẫu: `[1, 2, 1, 1, 3]`
- Output mẫu: `3` (cặp: (0,2), (0,3), (2,3)).

## Bài tập

1. **Tính tổng mảng**
   - Ý tưởng: duyệt mảng cộng dồn.
   - Input: `[1, 3, 5]` → Output: `9`.

2. **Tìm phần tử lớn nhất**
   - Ý tưởng: giữ biến max và cập nhật khi gặp phần tử lớn hơn.
   - Input: `[4, 2, 9, 1]` → Output: `9`.

3. **Kiểm tra mảng tăng dần**
   - Ý tưởng: kiểm tra `a[i] <= a[i+1]` cho mọi i.
   - Input: `[1, 2, 2, 4]` → Output: `true`.

4. **So sánh Linear vs Binary Search**
   - Ý tưởng: Linear $O(n)$, Binary $O(log n)$ với mảng đã sắp xếp.
   - Output mẫu: “Binary Search tăng chậm hơn Linear khi n lớn”.

5. **Sắp xếp 3 thuật toán theo tăng trưởng**
   - Ý tưởng: $O(1) < O(log n) < O(n) < O(n log n) < O(n^2)$.
   - Output mẫu: thứ tự theo Big-O.

6. **Đếm tần suất phần tử (Hash Map)**
   - Input: `[1,1,2,3,3,3]`
   - Output: `{1=2, 2=1, 3=3}`.
