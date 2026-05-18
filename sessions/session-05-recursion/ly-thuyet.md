# Buổi 05: Đệ quy & Backtracking

## Mục tiêu

- Hiểu cơ chế gọi đệ quy và stack call.
- Biết mô hình backtracking.

## Khái niệm chính

- Base case & recursive case.
- Backtracking: thử - sai - quay lui.

## Minh họa

```mermaid
flowchart TB
  A[Call f(3)] --> B[Call f(2)] --> C[Call f(1)] --> D[Base case]
```

## Ghi nhớ

- Luôn xác định base case.
- Theo dõi độ sâu đệ quy để tránh tràn stack.
