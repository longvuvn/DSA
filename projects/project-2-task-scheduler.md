# Project 2: Task Scheduler (Lập lịch công việc)

## Mục tiêu

Xây dựng hệ thống ưu tiên công việc theo deadline và mức độ ưu tiên.

## Kiến thức áp dụng

- Priority Queue / Heap
- Queue thường (FIFO)
- Phân tích độ phức tạp cho thao tác push/pop

## Yêu cầu chức năng

1. Thêm task (id, tên, deadline, priority).
2. Lấy task ưu tiên cao nhất.
3. Hoãn task (đẩy lại cuối queue thường).
4. In lịch sử xử lý.

## Gợi ý thiết kế

- Heap để lưu task ưu tiên.
- Queue để lưu task bị hoãn.

## Tiêu chí hoàn thành

- Push/Pop trên heap hoạt động đúng.
- Có kiểm thử với dữ liệu mẫu 50 task.
