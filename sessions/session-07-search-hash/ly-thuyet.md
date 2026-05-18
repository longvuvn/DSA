# Buổi 07: Searching & Hash

## Mục tiêu

- Biết tìm kiếm tuyến tính và nhị phân.
- Hiểu Hash Table và collision.

## Minh họa Hash Table

```mermaid
flowchart LR
  K1["key: A"] --> B1[Bucket 1]
  K2["key: B"] --> B2[Bucket 2]
  K3["key: C"] --> B1
```

## Ghi nhớ

- Binary Search chỉ áp dụng cho dữ liệu đã sắp xếp.
- Hash Table trung bình $O(1)$, tệ nhất $O(n)$.
