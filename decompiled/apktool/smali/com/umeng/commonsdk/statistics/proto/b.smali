.class public Lcom/umeng/commonsdk/statistics/proto/b;
.super Ljava/lang/Object;
.source "T5ZW"

# interfaces
.implements Lcom/umeng/analytics/pro/av;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final d:Ljava/util/Map;

.field public static final e:J = -0x5a285711b2a57f6bL

.field public static final f:Lcom/umeng/analytics/pro/bz;

.field public static final g:Lcom/umeng/analytics/pro/bp;

.field public static final h:Lcom/umeng/analytics/pro/bp;

.field public static final i:Lcom/umeng/analytics/pro/bp;

.field public static final j:Ljava/util/Map;

.field public static final k:I = 0x0

.field public static final l:I = 0x1


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:I

.field public m:B


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 40
    new-instance v0, Lcom/umeng/analytics/pro/bz;

    const-string v1, "IdSnapshot"

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bz;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->f:Lcom/umeng/analytics/pro/bz;

    .line 43
    new-instance v0, Lcom/umeng/analytics/pro/bp;

    const-string v1, "identity"

    const/16 v2, 0xb

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->g:Lcom/umeng/analytics/pro/bp;

    .line 45
    new-instance v0, Lcom/umeng/analytics/pro/bp;

    const/4 v4, 0x2

    const-string v5, "ts"

    const/16 v6, 0xa

    invoke-direct {v0, v5, v6, v4}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->h:Lcom/umeng/analytics/pro/bp;

    .line 47
    new-instance v0, Lcom/umeng/analytics/pro/bp;

    const/4 v4, 0x3

    const-string v7, "version"

    const/16 v8, 0x8

    invoke-direct {v0, v7, v8, v4}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->i:Lcom/umeng/analytics/pro/bp;

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->j:Ljava/util/Map;

    .line 54
    new-instance v4, Lcom/umeng/commonsdk/statistics/proto/b$b;

    const/4 v9, 0x0

    invoke-direct {v4, v9}, Lcom/umeng/commonsdk/statistics/proto/b$b;-><init>(Lcom/umeng/commonsdk/statistics/proto/b$1;)V

    const-class v10, Lcom/umeng/analytics/pro/ce;

    invoke-interface {v0, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    new-instance v4, Lcom/umeng/commonsdk/statistics/proto/b$d;

    invoke-direct {v4, v9}, Lcom/umeng/commonsdk/statistics/proto/b$d;-><init>(Lcom/umeng/commonsdk/statistics/proto/b$1;)V

    const-class v9, Lcom/umeng/analytics/pro/cf;

    invoke-interface {v0, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    new-instance v0, Ljava/util/EnumMap;

    const-class v4, Lcom/umeng/commonsdk/statistics/proto/b$e;

    invoke-direct {v0, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 139
    sget-object v4, Lcom/umeng/commonsdk/statistics/proto/b$e;->a:Lcom/umeng/commonsdk/statistics/proto/b$e;

    new-instance v9, Lcom/umeng/analytics/pro/bh;

    new-instance v10, Lcom/umeng/analytics/pro/bi;

    invoke-direct {v10, v2}, Lcom/umeng/analytics/pro/bi;-><init>(B)V

    invoke-direct {v9, v1, v3, v10}, Lcom/umeng/analytics/pro/bh;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bi;)V

    invoke-virtual {v0, v4, v9}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/b$e;->b:Lcom/umeng/commonsdk/statistics/proto/b$e;

    new-instance v2, Lcom/umeng/analytics/pro/bh;

    new-instance v4, Lcom/umeng/analytics/pro/bi;

    invoke-direct {v4, v6}, Lcom/umeng/analytics/pro/bi;-><init>(B)V

    invoke-direct {v2, v5, v3, v4}, Lcom/umeng/analytics/pro/bh;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bi;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/b$e;->c:Lcom/umeng/commonsdk/statistics/proto/b$e;

    new-instance v2, Lcom/umeng/analytics/pro/bh;

    new-instance v4, Lcom/umeng/analytics/pro/bi;

    invoke-direct {v4, v8}, Lcom/umeng/analytics/pro/bi;-><init>(B)V

    invoke-direct {v2, v7, v3, v4}, Lcom/umeng/analytics/pro/bh;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bi;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->d:Ljava/util/Map;

    .line 151
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/b;

    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bh;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 133
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    return-void
.end method

.method public constructor <init>(Lcom/umeng/commonsdk/statistics/proto/b;)V
    .locals 2

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 133
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    .line 170
    iget-byte v0, p1, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    .line 171
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p1, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 174
    :cond_0
    iget-wide v0, p1, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    .line 175
    iget p1, p1, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    iput p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JI)V
    .locals 0

    .line 158
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/b;-><init>()V

    .line 159
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 160
    iput-wide p2, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    const/4 p1, 0x1

    .line 161
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->b(Z)V

    .line 162
    iput p4, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    .line 163
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->c(Z)V

    return-void
.end method

.method private a(Ljava/io/ObjectInputStream;)V
    .locals 2

    const/4 v0, 0x0

    .line 336
    :try_start_0
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    .line 337
    new-instance v0, Lcom/umeng/analytics/pro/bo;

    new-instance v1, Lcom/umeng/analytics/pro/cg;

    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/cg;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bo;-><init>(Lcom/umeng/analytics/pro/ci;)V

    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/b;->read(Lcom/umeng/analytics/pro/bu;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/bb; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 340
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Ljava/io/ObjectOutputStream;)V
    .locals 2

    .line 325
    :try_start_0
    new-instance v0, Lcom/umeng/analytics/pro/bo;

    new-instance v1, Lcom/umeng/analytics/pro/cg;

    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/cg;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bo;-><init>(Lcom/umeng/analytics/pro/ci;)V

    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/b;->write(Lcom/umeng/analytics/pro/bu;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/bb; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 328
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic l()Lcom/umeng/analytics/pro/bz;
    .locals 1

    .line 36
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->f:Lcom/umeng/analytics/pro/bz;

    return-object v0
.end method

.method public static synthetic m()Lcom/umeng/analytics/pro/bp;
    .locals 1

    .line 36
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->g:Lcom/umeng/analytics/pro/bp;

    return-object v0
.end method

.method public static synthetic n()Lcom/umeng/analytics/pro/bp;
    .locals 1

    .line 36
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->h:Lcom/umeng/analytics/pro/bp;

    return-object v0
.end method

.method public static synthetic o()Lcom/umeng/analytics/pro/bp;
    .locals 1

    .line 36
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->i:Lcom/umeng/analytics/pro/bp;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/umeng/commonsdk/statistics/proto/b;
    .locals 1

    .line 179
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/b;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/statistics/proto/b;-><init>(Lcom/umeng/commonsdk/statistics/proto/b;)V

    return-object v0
.end method

.method public a(I)Lcom/umeng/commonsdk/statistics/proto/b;
    .locals 0

    .line 249
    iput p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    const/4 p1, 0x1

    .line 250
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->c(Z)V

    return-object p0
.end method

.method public a(J)Lcom/umeng/commonsdk/statistics/proto/b;
    .locals 0

    .line 223
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    const/4 p1, 0x1

    .line 224
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->b(Z)V

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/b;
    .locals 0

    .line 196
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 214
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public b(I)Lcom/umeng/commonsdk/statistics/proto/b$e;
    .locals 0

    .line 271
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/proto/b$e;->a(I)Lcom/umeng/commonsdk/statistics/proto/b$e;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Z)V
    .locals 2

    .line 241
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/as;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    .line 201
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 267
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/as;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    return-void
.end method

.method public clear()V
    .locals 3

    const/4 v0, 0x0

    .line 184
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    const/4 v0, 0x0

    .line 185
    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/b;->b(Z)V

    const-wide/16 v1, 0x0

    .line 186
    iput-wide v1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    .line 187
    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/proto/b;->c(Z)V

    .line 188
    iput v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    return-void
.end method

.method public d()Z
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic deepCopy()Lcom/umeng/analytics/pro/av;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/b;->a()Lcom/umeng/commonsdk/statistics/proto/b;

    move-result-object v0

    return-object v0
.end method

.method public e()J
    .locals 2

    .line 219
    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    return-wide v0
.end method

.method public f()V
    .locals 2

    .line 229
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/as;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    return-void
.end method

.method public synthetic fieldForId(I)Lcom/umeng/analytics/pro/bc;
    .locals 0

    .line 36
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->b(I)Lcom/umeng/commonsdk/statistics/proto/b$e;

    move-result-object p1

    return-object p1
.end method

.method public g()Z
    .locals 2

    .line 237
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/as;->a(BI)Z

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    .line 245
    iget v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    return v0
.end method

.method public i()V
    .locals 2

    .line 255
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/as;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    return-void
.end method

.method public j()Z
    .locals 2

    .line 263
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->m:B

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/as;->a(BI)Z

    move-result v0

    return v0
.end method

.method public k()V
    .locals 3

    .line 312
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-void

    .line 313
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/bv;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required field \'identity\' was not present! Struct: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 314
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bv;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public read(Lcom/umeng/analytics/pro/bu;)V
    .locals 2

    .line 276
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->j:Ljava/util/Map;

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
    .locals 4

    .line 286
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IdSnapshot(identity:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 290
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "null"

    .line 291
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 293
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, ", "

    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ts:"

    .line 298
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    iget-wide v2, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 302
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "version:"

    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    iget v1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Lcom/umeng/analytics/pro/bu;)V
    .locals 2

    .line 281
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->j:Ljava/util/Map;

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
