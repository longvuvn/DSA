# Buổi 08: Kết quả

## Thực hành

### Bài 1: Duyệt cây

- Ý tưởng: DFS pre/in/post-order.
- Với cây mẫu (8,4,10,2,6):
  - Pre-order: `8 4 2 6 10`
  - In-order: `2 4 6 8 10`
  - Post-order: `2 6 4 10 8`.

### Bài 2: Tính chiều cao cây

- Ý tưởng: height = 1 + max(height(left), height(right)).
- Output mẫu: cây trên → height = `3`.

## Bài tập

1. **Đếm số leaf**
   - Output mẫu: cây trên có `3` leaf.

2. **Tìm depth node x**
   - Input: x=6 → Output: depth `2` (root depth 0).

3. **Kiểm tra cây cân bằng**
   - Output mẫu: cây lệch trái sâu → `false`.

4. **Serialize/Deserialize**
   - Ý tưởng: BFS/DFS với null marker.
   - Output mẫu: `"8,4,10,2,6,null,null"`.
