# Buổi 03: Linked List

## Mục tiêu

- Hiểu cấu trúc node và con trỏ.
- Thao tác chèn/xóa ở đầu/cuối.

## Khái niệm chính

- Node: chứa dữ liệu + con trỏ next.
- Head: node đầu tiên.

## Minh họa

```mermaid
flowchart LR
  H[Head] --> N1[Node: 5]
  N1 --> N2[Node: 9]
  N2 --> N3[Node: 2]
  N3 --> Null[null]
```

## Ghi nhớ

- Chèn/xóa đầu: $O(1)$.
- Tìm kiếm: $O(n)$.
