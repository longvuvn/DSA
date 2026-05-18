# Buổi 01: Thực hành

## Bài thực hành 1: Phân tích độ phức tạp

1. Viết 3 đoạn code:
   - Một vòng lặp.
   - Hai vòng lặp lồng nhau.
   - Vòng lặp giảm $n$ xuống $n/2$.
2. Ghi chú Big-O cho từng đoạn.

## Bài thực hành 2: Đếm số cặp bằng nhau

- Input: mảng số nguyên.
- Output: số cặp $(i, j)$ sao cho $a[i] == a[j]$.

### Gợi ý

- Cách 1: 2 vòng lặp $O(n^2)$.
- Cách 2: dùng Hash Map $O(n)$.

## Kiểm thử nhanh

- Input: `[1, 2, 1, 1, 3]`
- Output: `3` (cặp: (0,2), (0,3), (2,3))
