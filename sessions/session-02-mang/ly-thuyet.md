# Buổi 02: Mảng & Mảng động

## Mục tiêu

- Hiểu cách lưu trữ liên tiếp trong bộ nhớ.
- Nắm thao tác truy cập, chèn, xóa.

## Khái niệm chính

- Mảng tĩnh: kích thước cố định.
- Mảng động: thay đổi kích thước (vector/list).

## Minh họa

```mermaid
flowchart LR
  A0[0] --> A1[1] --> A2[2] --> A3[3] --> A4[4]
  subgraph Array Index
    A0
    A1
    A2
    A3
    A4
  end
```

## Ghi nhớ

- Truy cập theo index: $O(1)$.
- Chèn/xóa ở giữa: $O(n)$ do phải dời phần tử.
