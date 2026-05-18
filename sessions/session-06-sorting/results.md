# Buổi 06: Kết quả

## Thực hành

### Bài 1: Bubble Sort

- Ý tưởng: đưa phần tử lớn nhất về cuối qua swap.
- Input: `[5,1,4,2,8]` → Output: `[1,2,4,5,8]`.

### Bài 2: Merge Sort

- Ý tưởng: chia đôi, sort đệ quy, merge.
- Input: `[3,1,4,1,5]` → Output: `[1,1,3,4,5]`.

## Bài tập

1. **Insertion Sort**
   - Input: `[4,3,2,1]` → Output: `[1,2,3,4]`.

2. **So sánh Quick vs Merge**
   - Output mẫu: Quick avg $O(n log n)$, worst $O(n^2)$; Merge luôn $O(n log n)$, stable.

3. **Sort theo key (stable/unstable)**
   - Input: `[(A,2),(B,2),(C,1)]` sort theo key=2/1
   - Output stable: `[(C,1),(A,2),(B,2)]`.

4. **Quick Select (k nhỏ nhất)**
   - Input: `[7,10,4,3,20,15]`, k=3 → Output: `7`.
