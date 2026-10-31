.class public final Ll/۠ۨ᩵;
.super Ljava/lang/Object;
.source "A8DI"


# instance fields
.field public final ֫:Ljava/util/BitSet;

.field public final ۧ:I


# direct methods
.method public constructor <init>(BI)V
    .locals 2

    .line 333
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    .line 334
    invoke-static {v0}, Ljava/util/BitSet;->valueOf([B)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Ll/۠ۨ᩵;->֫:Ljava/util/BitSet;

    .line 335
    iput p2, p0, Ll/۠ۨ᩵;->ۧ:I

    .line 336
    invoke-direct {p0}, Ll/۠ۨ᩵;->ۧ()V

    return-void
.end method

.method public varargs constructor <init>([Ll/֨ۨ᩵;)V
    .locals 4

    .line 322
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 323
    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/۠ۨ᩵;->֫:Ljava/util/BitSet;

    const/4 v0, 0x1

    .line 324
    iput v0, p0, Ll/۠ۨ᩵;->ۧ:I

    if-eqz p1, :cond_0

    .line 326
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 327
    iget-object v3, p0, Ll/۠ۨ᩵;->֫:Ljava/util/BitSet;

    invoke-static {v2}, Ll/֨ۨ᩵;->֫(Ll/֨ۨ᩵;)I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 330
    :cond_0
    invoke-direct {p0}, Ll/۠ۨ᩵;->ۧ()V

    return-void
.end method

.method public static ֫(B)Ll/۠ۨ᩵;
    .locals 3

    and-int/lit16 v0, p0, 0xc0

    int-to-byte v0, v0

    .line 341
    new-instance v1, Ll/۠ۨ᩵;

    ushr-int/lit8 v2, v0, 0x6

    xor-int/2addr p0, v0

    int-to-byte p0, p0

    invoke-direct {v1, p0, v2}, Ll/۠ۨ᩵;-><init>(BI)V

    return-object v1
.end method

.method private ۧ()V
    .locals 4

    .line 349
    sget-object v0, Ll/֨ۨ᩵;->۫:Ll/֨ۨ᩵;

    invoke-static {v0}, Ll/֨ۨ᩵;->֫(Ll/֨ۨ᩵;)I

    move-result v0

    iget-object v1, p0, Ll/۠ۨ᩵;->֫:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 352
    sget-object v0, Ll/֨ۨ᩵;->ۤ:Ll/֨ۨ᩵;

    invoke-static {v0}, Ll/֨ۨ᩵;->֫(Ll/֨ۨ᩵;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 355
    sget-object v0, Ll/֨ۨ᩵;->ۙ:Ll/֨ۨ᩵;

    invoke-static {v0}, Ll/֨ۨ᩵;->֫(Ll/֨ۨ᩵;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 358
    iget v1, p0, Ll/۠ۨ᩵;->ۧ:I

    if-ne v1, v0, :cond_0

    return-void

    .line 359
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v2, "Version "

    const-string v3, " is unsupported"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 359
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 356
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 353
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Reserved1 field must be 0"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 350
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Reserved0 field must be 0"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()B
    .locals 2

    .line 345
    iget-object v0, p0, Ll/۠ۨ᩵;->֫:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->toByteArray()[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    iget v1, p0, Ll/۠ۨ᩵;->ۧ:I

    and-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    int-to-byte v0, v0

    return v0
.end method

.method public final ֫(Ll/֨ۨ᩵;)Z
    .locals 1

    .line 364
    iget-object v0, p0, Ll/۠ۨ᩵;->֫:Ljava/util/BitSet;

    invoke-static {p1}, Ll/֨ۨ᩵;->֫(Ll/֨ۨ᩵;)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method
