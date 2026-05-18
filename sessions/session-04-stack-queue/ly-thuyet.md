# Buổi 04: Stack & Queue

## Mục tiêu

- Hiểu LIFO/FIFO và ứng dụng.

## Khái niệm chính

- Stack: push/pop/top.
- Queue: enqueue/dequeue/front.

## Minh họa

```mermaid
flowchart TB
  subgraph Stack
    S3[Top]
    S2
    S1[Bottom]
  end
  subgraph Queue
    Q1[Front] --> Q2 --> Q3[Rear]
  end
```

## Ghi nhớ

- Stack dùng cho undo, backtracking.
- Queue dùng cho BFS, xử lý theo thứ tự.
