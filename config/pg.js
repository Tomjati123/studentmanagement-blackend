import pg from "pg";
const { Pool } = pg;

const pool = new Pool({
  user: "postgres",
  host: "localhost",
  database: "TT",
  password: "zxc1451234",
  port: 5432,
});

export default pool;
