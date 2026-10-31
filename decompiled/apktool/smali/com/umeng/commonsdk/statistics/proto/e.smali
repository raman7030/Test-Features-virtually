.class public Lcom/umeng/commonsdk/statistics/proto/e;
.super Ljava/lang/Object;
.source "351Q"

# interfaces
.implements Lcom/umeng/analytics/pro/av;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final d:Ljava/util/Map;

.field public static final e:J = 0x681b59944df50d21L

.field public static final f:Lcom/umeng/analytics/pro/bz;

.field public static final g:Lcom/umeng/analytics/pro/bp;

.field public static final h:Lcom/umeng/analytics/pro/bp;

.field public static final i:Lcom/umeng/analytics/pro/bp;

.field public static final j:Ljava/util/Map;

.field public static final k:I


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:Ljava/lang/String;

.field public l:B

.field public m:[Lcom/umeng/commonsdk/statistics/proto/e$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 41
    new-instance v0, Lcom/umeng/analytics/pro/bz;

    const-string v1, "ImprintValue"

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bz;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->f:Lcom/umeng/analytics/pro/bz;

    .line 44
    new-instance v0, Lcom/umeng/analytics/pro/bp;

    const/4 v1, 0x1

    const-string v2, "value"

    const/16 v3, 0xb

    invoke-direct {v0, v2, v3, v1}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->g:Lcom/umeng/analytics/pro/bp;

    .line 46
    new-instance v0, Lcom/umeng/analytics/pro/bp;

    const-string v1, "ts"

    const/16 v4, 0xa

    const/4 v5, 0x2

    invoke-direct {v0, v1, v4, v5}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->h:Lcom/umeng/analytics/pro/bp;

    .line 48
    new-instance v0, Lcom/umeng/analytics/pro/bp;

    const/4 v6, 0x3

    const-string v7, "guid"

    invoke-direct {v0, v7, v3, v6}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->i:Lcom/umeng/analytics/pro/bp;

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->j:Ljava/util/Map;

    .line 55
    new-instance v6, Lcom/umeng/commonsdk/statistics/proto/e$b;

    const/4 v8, 0x0

    invoke-direct {v6, v8}, Lcom/umeng/commonsdk/statistics/proto/e$b;-><init>(Lcom/umeng/commonsdk/statistics/proto/e$1;)V

    const-class v9, Lcom/umeng/analytics/pro/ce;

    invoke-interface {v0, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    new-instance v6, Lcom/umeng/commonsdk/statistics/proto/e$d;

    invoke-direct {v6, v8}, Lcom/umeng/commonsdk/statistics/proto/e$d;-><init>(Lcom/umeng/commonsdk/statistics/proto/e$1;)V

    const-class v8, Lcom/umeng/analytics/pro/cf;

    invoke-interface {v0, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    new-instance v0, Ljava/util/EnumMap;

    const-class v6, Lcom/umeng/commonsdk/statistics/proto/e$e;

    invoke-direct {v0, v6}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 141
    sget-object v6, Lcom/umeng/commonsdk/statistics/proto/e$e;->a:Lcom/umeng/commonsdk/statistics/proto/e$e;

    new-instance v8, Lcom/umeng/analytics/pro/bh;

    new-instance v9, Lcom/umeng/analytics/pro/bi;

    invoke-direct {v9, v3}, Lcom/umeng/analytics/pro/bi;-><init>(B)V

    invoke-direct {v8, v2, v5, v9}, Lcom/umeng/analytics/pro/bh;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bi;)V

    invoke-virtual {v0, v6, v8}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/e$e;->b:Lcom/umeng/commonsdk/statistics/proto/e$e;

    new-instance v6, Lcom/umeng/analytics/pro/bh;

    new-instance v8, Lcom/umeng/analytics/pro/bi;

    invoke-direct {v8, v4}, Lcom/umeng/analytics/pro/bi;-><init>(B)V

    invoke-direct {v6, v1, v5, v8}, Lcom/umeng/analytics/pro/bh;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bi;)V

    invoke-virtual {v0, v2, v6}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/e$e;->c:Lcom/umeng/commonsdk/statistics/proto/e$e;

    new-instance v2, Lcom/umeng/analytics/pro/bh;

    new-instance v4, Lcom/umeng/analytics/pro/bi;

    invoke-direct {v4, v3}, Lcom/umeng/analytics/pro/bi;-><init>(B)V

    invoke-direct {v2, v7, v5, v4}, Lcom/umeng/analytics/pro/bh;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bi;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->d:Ljava/util/Map;

    .line 151
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/e;

    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bh;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 133
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 134
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/e$e;->a:Lcom/umeng/commonsdk/statistics/proto/e$e;

    aput-object v2, v1, v0

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e$e;->b:Lcom/umeng/commonsdk/statistics/proto/e$e;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e$e;->c:Lcom/umeng/commonsdk/statistics/proto/e$e;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->m:[Lcom/umeng/commonsdk/statistics/proto/e$e;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/e;-><init>()V

    .line 159
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    const/4 p1, 0x1

    .line 160
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/e;->b(Z)V

    .line 161
    iput-object p3, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/umeng/commonsdk/statistics/proto/e;)V
    .locals 3

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 133
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 134
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/e$e;->a:Lcom/umeng/commonsdk/statistics/proto/e$e;

    aput-object v2, v1, v0

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e$e;->b:Lcom/umeng/commonsdk/statistics/proto/e$e;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e$e;->c:Lcom/umeng/commonsdk/statistics/proto/e$e;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->m:[Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 168
    iget-byte v0, p1, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    .line 169
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/e;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 172
    :cond_0
    iget-wide v0, p1, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    .line 173
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/e;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    iget-object p1, p1, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private a(Ljava/io/ObjectInputStream;)V
    .locals 2

    const/4 v0, 0x0

    .line 337
    :try_start_0
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    .line 338
    new-instance v0, Lcom/umeng/analytics/pro/bo;

    new-instance v1, Lcom/umeng/analytics/pro/cg;

    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/cg;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bo;-><init>(Lcom/umeng/analytics/pro/ci;)V

    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/e;->read(Lcom/umeng/analytics/pro/bu;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/bb; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 341
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Ljava/io/ObjectOutputStream;)V
    .locals 2

    .line 326
    :try_start_0
    new-instance v0, Lcom/umeng/analytics/pro/bo;

    new-instance v1, Lcom/umeng/analytics/pro/cg;

    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/cg;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bo;-><init>(Lcom/umeng/analytics/pro/ci;)V

    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/e;->write(Lcom/umeng/analytics/pro/bu;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/bb; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 329
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic l()Lcom/umeng/analytics/pro/bz;
    .locals 1

    .line 37
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->f:Lcom/umeng/analytics/pro/bz;

    return-object v0
.end method

.method public static synthetic m()Lcom/umeng/analytics/pro/bp;
    .locals 1

    .line 37
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->g:Lcom/umeng/analytics/pro/bp;

    return-object v0
.end method

.method public static synthetic n()Lcom/umeng/analytics/pro/bp;
    .locals 1

    .line 37
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->h:Lcom/umeng/analytics/pro/bp;

    return-object v0
.end method

.method public static synthetic o()Lcom/umeng/analytics/pro/bp;
    .locals 1

    .line 37
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->i:Lcom/umeng/analytics/pro/bp;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/umeng/commonsdk/statistics/proto/e$e;
    .locals 0

    .line 271
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/proto/e$e;->a(I)Lcom/umeng/commonsdk/statistics/proto/e$e;

    move-result-object p1

    return-object p1
.end method

.method public a()Lcom/umeng/commonsdk/statistics/proto/e;
    .locals 1

    .line 179
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/e;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/statistics/proto/e;-><init>(Lcom/umeng/commonsdk/statistics/proto/e;)V

    return-object v0
.end method

.method public a(J)Lcom/umeng/commonsdk/statistics/proto/e;
    .locals 0

    .line 222
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    const/4 p1, 0x1

    .line 223
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/e;->b(Z)V

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/e;
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 213
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/e;
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Z)V
    .locals 2

    .line 240
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/as;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    .line 200
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    return-void
.end method

.method public c(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 266
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 3

    const/4 v0, 0x0

    .line 184
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    const/4 v1, 0x0

    .line 185
    invoke-virtual {p0, v1}, Lcom/umeng/commonsdk/statistics/proto/e;->b(Z)V

    const-wide/16 v1, 0x0

    .line 186
    iput-wide v1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    .line 187
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    return-void
.end method

.method public d()Z
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic deepCopy()Lcom/umeng/analytics/pro/av;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/e;->a()Lcom/umeng/commonsdk/statistics/proto/e;

    move-result-object v0

    return-object v0
.end method

.method public e()J
    .locals 2

    .line 218
    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    return-wide v0
.end method

.method public f()V
    .locals 2

    .line 228
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/as;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    return-void
.end method

.method public synthetic fieldForId(I)Lcom/umeng/analytics/pro/bc;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/e;->a(I)Lcom/umeng/commonsdk/statistics/proto/e$e;

    move-result-object p1

    return-object p1
.end method

.method public g()Z
    .locals 2

    .line 236
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->l:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/as;->a(BI)Z

    move-result v0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x0

    .line 253
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    return-void
.end method

.method public j()Z
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public read(Lcom/umeng/analytics/pro/bu;)V
    .locals 2

    .line 276
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->j:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/cd;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/cd;->b()Lcom/umeng/analytics/pro/cc;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/cc;->b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 286
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ImprintValue("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/e;->d()Z

    move-result v1

    const-string v2, ", "

    const-string v3, "null"

    if-eqz v1, :cond_1

    const-string v1, "value:"

    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 292
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 294
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, "ts:"

    .line 300
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    iget-wide v4, p0, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 304
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "guid:"

    .line 305
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 307
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 309
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, ")"

    .line 312
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Lcom/umeng/analytics/pro/bu;)V
    .locals 2

    .line 281
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->j:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/cd;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/cd;->b()Lcom/umeng/analytics/pro/cc;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/cc;->a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V

    return-void
.end method
