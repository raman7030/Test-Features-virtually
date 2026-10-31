.class public final enum Ll/֡ۨۖ;
.super Ljava/lang/Enum;
.source "S9IV"

# interfaces
.implements Ll/᩸ܰۖ;


# static fields
.field public static final synthetic ۗ:[Ll/֡ۨۖ;

.field public static final enum ۛ:Ll/֡ۨۖ;

.field public static final enum ۤ:Ll/֡ۨۖ;

.field public static final enum ۫:Ll/֡ۨۖ;

.field public static final enum ۬:Ll/֡ۨۖ;


# instance fields
.field public ۙ:J

.field public ᩶:I

.field public ᩸:Ljava/lang/String;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    .line 24
    new-instance v8, Ll/֡ۨۖ;

    const/16 v6, 0xb

    const/16 v7, 0x10

    const-string v1, "AES_128_CCM"

    const/4 v2, 0x0

    const-wide/16 v3, 0x1

    const-string v5, "AES/CCM/NoPadding"

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ll/֡ۨۖ;-><init>(Ljava/lang/String;IJLjava/lang/String;II)V

    sput-object v8, Ll/֡ۨۖ;->۬:Ll/֡ۨۖ;

    .line 25
    new-instance v0, Ll/֡ۨۖ;

    const/16 v15, 0xc

    const/16 v16, 0x10

    const-string v10, "AES_128_GCM"

    const/4 v11, 0x1

    const-wide/16 v12, 0x2

    const-string v14, "AES/GCM/NoPadding"

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Ll/֡ۨۖ;-><init>(Ljava/lang/String;IJLjava/lang/String;II)V

    sput-object v0, Ll/֡ۨۖ;->۫:Ll/֡ۨۖ;

    .line 26
    new-instance v0, Ll/֡ۨۖ;

    const/16 v7, 0xb

    const/16 v8, 0x20

    const-string v2, "AES_256_CCM"

    const/4 v3, 0x2

    const-wide/16 v4, 0x3

    const-string v6, "AES/CCM/NoPadding"

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ll/֡ۨۖ;-><init>(Ljava/lang/String;IJLjava/lang/String;II)V

    sput-object v0, Ll/֡ۨۖ;->ۤ:Ll/֡ۨۖ;

    .line 27
    new-instance v0, Ll/֡ۨۖ;

    const/16 v16, 0x20

    const-string v10, "AES_256_GCM"

    const/4 v11, 0x3

    const-wide/16 v12, 0x4

    const-string v14, "AES/GCM/NoPadding"

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Ll/֡ۨۖ;-><init>(Ljava/lang/String;IJLjava/lang/String;II)V

    sput-object v0, Ll/֡ۨۖ;->ۛ:Ll/֡ۨۖ;

    .line 23
    invoke-static {}, Ll/֡ۨۖ;->᩻()[Ll/֡ۨۖ;

    move-result-object v0

    sput-object v0, Ll/֡ۨۖ;->ۗ:[Ll/֡ۨۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;II)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 35
    iput-wide p3, p0, Ll/֡ۨۖ;->ۙ:J

    .line 36
    iput-object p5, p0, Ll/֡ۨۖ;->᩸:Ljava/lang/String;

    .line 37
    iput p6, p0, Ll/֡ۨۖ;->᩶:I

    .line 38
    iput p7, p0, Ll/֡ۨۖ;->᩹:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/֡ۨۖ;
    .locals 1

    .line 23
    const-class v0, Ll/֡ۨۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/֡ۨۖ;

    return-object p0
.end method

.method public static values()[Ll/֡ۨۖ;
    .locals 1

    .line 23
    sget-object v0, Ll/֡ۨۖ;->ۗ:[Ll/֡ۨۖ;

    invoke-virtual {v0}, [Ll/֡ۨۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/֡ۨۖ;

    return-object v0
.end method

.method public static synthetic ᩻()[Ll/֡ۨۖ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/֡ۨۖ;

    .line 23
    sget-object v1, Ll/֡ۨۖ;->۬:Ll/֡ۨۖ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۨۖ;->۫:Ll/֡ۨۖ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۨۖ;->ۤ:Ll/֡ۨۖ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۨۖ;->ۛ:Ll/֡ۨۖ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getValue()J
    .locals 2

    .line 42
    iget-wide v0, p0, Ll/֡ۨۖ;->ۙ:J

    return-wide v0
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/֡ۨۖ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public ۧ()I
    .locals 1

    .line 54
    iget v0, p0, Ll/֡ۨۖ;->᩹:I

    return v0
.end method

.method public ܿ()I
    .locals 1

    .line 50
    iget v0, p0, Ll/֡ۨۖ;->᩶:I

    return v0
.end method
