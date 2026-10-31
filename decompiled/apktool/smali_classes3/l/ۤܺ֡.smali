.class public final Ll/ۤܺ֡;
.super Ljava/lang/Object;
.source "A641"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x7d0cc2180c52bb3cL


# instance fields
.field public final ۗ:[[Z

.field public ۙ:Ljava/lang/String;

.field public ۛ:Ljava/lang/String;

.field public ۤ:I

.field public ۫:J

.field public ۬:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/util/Calendar;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 70
    iput v0, p0, Ll/ۤܺ֡;->ۤ:I

    const-wide/16 v1, -0x1

    .line 76
    iput-wide v1, p0, Ll/ۤܺ֡;->۫:J

    const-string v1, ""

    .line 82
    iput-object v1, p0, Ll/ۤܺ֡;->ۛ:Ljava/lang/String;

    .line 85
    iput-object v1, p0, Ll/ۤܺ֡;->᩹:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x1

    aput v0, v1, v2

    const/4 v2, 0x0

    aput v0, v1, v2

    .line 101
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Z

    iput-object v0, p0, Ll/ۤܺ֡;->ۗ:[[Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 70
    iput v0, p0, Ll/ۤܺ֡;->ۤ:I

    const-wide/16 v0, -0x1

    .line 76
    iput-wide v0, p0, Ll/ۤܺ֡;->۫:J

    const-string v0, ""

    .line 82
    iput-object v0, p0, Ll/ۤܺ֡;->ۛ:Ljava/lang/String;

    .line 85
    iput-object v0, p0, Ll/ۤܺ֡;->᩹:Ljava/lang/String;

    const/4 v0, 0x0

    .line 111
    iput-object v0, p0, Ll/ۤܺ֡;->ۗ:[[Z

    .line 112
    iput-object p1, p0, Ll/ۤܺ֡;->۬:Ljava/lang/String;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 311
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Serialization is not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 504
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Serialization is not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ۤܺ֡;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/ۤܺ֡;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 397
    iput p1, p0, Ll/ۤܺ֡;->ۤ:I

    return-void
.end method

.method public final ֫(IIZ)V
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ۤܺ֡;->ۗ:[[Z

    aget-object p1, v0, p1

    aput-boolean p3, p1, p2

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 379
    iput-wide p1, p0, Ll/ۤܺ֡;->۫:J

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 320
    iput-object p1, p0, Ll/ۤܺ֡;->᩹:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/Calendar;)V
    .locals 0

    .line 388
    iput-object p1, p0, Ll/ۤܺ֡;->᩸:Ljava/util/Calendar;

    return-void
.end method

.method public final ֫(II)Z
    .locals 1

    .line 230
    iget-object v0, p0, Ll/ۤܺ֡;->ۗ:[[Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 233
    :cond_0
    aget-object p1, v0, p1

    aget-boolean p1, p1, p2

    return p1
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۤܺ֡;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 260
    iget v0, p0, Ll/ۤܺ֡;->ۤ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 251
    iget v0, p0, Ll/ۤܺ֡;->ۤ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ۤܺ֡;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 338
    iput-object p1, p0, Ll/ۤܺ֡;->᩶:Ljava/lang/String;

    return-void
.end method

.method public final ܳ()Ljava/util/Calendar;
    .locals 1

    .line 189
    iget-object v0, p0, Ll/ۤܺ֡;->᩸:Ljava/util/Calendar;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۤܺ֡;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 347
    iput-object p1, p0, Ll/ۤܺ֡;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ܿ()J
    .locals 2

    .line 180
    iget-wide v0, p0, Ll/ۤܺ֡;->۫:J

    return-wide v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 0

    .line 406
    iput-object p1, p0, Ll/ۤܺ֡;->ۛ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ۤܺ֡;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 370
    iput-object p1, p0, Ll/ۤܺ֡;->۬:Ljava/lang/String;

    return-void
.end method

.method public final ᩷()Z
    .locals 2

    .line 242
    iget v0, p0, Ll/ۤܺ֡;->ۤ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 208
    iget v0, p0, Ll/ۤܺ֡;->ۤ:I

    return v0
.end method
