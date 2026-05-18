# Buổi 11: Kết quả

## Thực hành

### Bài 1: BFS/DFS

- Với đồ thị mẫu 0-1,0-2,1-3,2-4:
  - BFS từ 0 → `0 1 2 3 4`
  - DFS từ 0 → `0 1 3 2 4` (một thứ tự hợp lệ).

### Bài 2: Kiểm tra liên thông

- Input: edges (0-1), (2-3) → Output: `2` thành phần liên thông.

## Bài tập

1. **Chu trình vô hướng**
   - Input: tam giác 0-1-2-0 → Output: `true`.

2. **Shortest path unweighted**
   - Input: 0 -> 4 (trên đồ thị mẫu) → Output: `2` cạnh.

3. **Topological sort**
   - Output mẫu: `5 4 2 3 1 0` (một thứ tự hợp lệ).

4. **Dijkstra**
   - Input: 0-1(4),0-2(1),2-1(2),1-3(1),2-3(5)
   - Output: dist(0→3) = `4`.
