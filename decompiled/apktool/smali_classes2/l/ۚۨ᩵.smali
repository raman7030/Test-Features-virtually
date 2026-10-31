.class public final enum Ll/ۚۨ᩵;
.super Ljava/lang/Enum;
.source "A8DI"


# static fields
.field public static final enum ۗ:Ll/ۚۨ᩵;

.field public static final enum ۙ:Ll/ۚۨ᩵;

.field public static final enum ۬:Ll/ۚۨ᩵;

.field public static final enum ᩶:Ll/ۚۨ᩵;

.field public static final synthetic ᩹:[Ll/ۚۨ᩵;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 289
    new-instance v0, Ll/ۚۨ᩵;

    const/4 v1, 0x0

    const/4 v2, 0x4

    const-string v3, "SIZE_64KB"

    invoke-direct {v0, v3, v1, v2}, Ll/ۚۨ᩵;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۚۨ᩵;->۬:Ll/ۚۨ᩵;

    new-instance v0, Ll/ۚۨ᩵;

    const/4 v1, 0x1

    const/4 v2, 0x5

    const-string v3, "SIZE_256KB"

    invoke-direct {v0, v3, v1, v2}, Ll/ۚۨ᩵;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۚۨ᩵;->ۙ:Ll/ۚۨ᩵;

    new-instance v0, Ll/ۚۨ᩵;

    const/4 v1, 0x2

    const/4 v2, 0x6

    const-string v3, "SIZE_1MB"

    invoke-direct {v0, v3, v1, v2}, Ll/ۚۨ᩵;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۚۨ᩵;->᩶:Ll/ۚۨ᩵;

    new-instance v0, Ll/ۚۨ᩵;

    const/4 v1, 0x3

    const/4 v2, 0x7

    const-string v3, "SIZE_4MB"

    invoke-direct {v0, v3, v1, v2}, Ll/ۚۨ᩵;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۚۨ᩵;->ۗ:Ll/ۚۨ᩵;

    .line 288
    invoke-static {}, Ll/ۚۨ᩵;->ۧ()[Ll/ۚۨ᩵;

    move-result-object v0

    sput-object v0, Ll/ۚۨ᩵;->᩹:[Ll/ۚۨ᩵;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 292
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 293
    iput p3, p0, Ll/ۚۨ᩵;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۚۨ᩵;
    .locals 1

    .line 288
    const-class v0, Ll/ۚۨ᩵;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۚۨ᩵;

    return-object p0
.end method

.method public static values()[Ll/ۚۨ᩵;
    .locals 1

    .line 288
    sget-object v0, Ll/ۚۨ᩵;->᩹:[Ll/ۚۨ᩵;

    invoke-virtual {v0}, [Ll/ۚۨ᩵;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۚۨ᩵;

    return-object v0
.end method

.method public static ֫(I)Ll/ۚۨ᩵;
    .locals 3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_3

    const/4 v0, 0x5

    if-eq p0, v0, :cond_2

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/4 v0, 0x7

    if-ne p0, v0, :cond_0

    .line 299
    sget-object p0, Ll/ۚۨ᩵;->ۗ:Ll/ۚۨ᩵;

    return-object p0

    .line 307
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v1, "Block size must be 4-7. Cannot use value of ["

    const-string v2, "]"

    .line 0
    invoke-static {p0, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 307
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 301
    :cond_1
    sget-object p0, Ll/ۚۨ᩵;->᩶:Ll/ۚۨ᩵;

    return-object p0

    .line 303
    :cond_2
    sget-object p0, Ll/ۚۨ᩵;->ۙ:Ll/ۚۨ᩵;

    return-object p0

    .line 305
    :cond_3
    sget-object p0, Ll/ۚۨ᩵;->۬:Ll/ۚۨ᩵;

    return-object p0
.end method

.method public static synthetic ۧ()[Ll/ۚۨ᩵;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ۚۨ᩵;

    .line 288
    sget-object v1, Ll/ۚۨ᩵;->۬:Ll/ۚۨ᩵;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚۨ᩵;->ۙ:Ll/ۚۨ᩵;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚۨ᩵;->᩶:Ll/ۚۨ᩵;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚۨ᩵;->ۗ:Ll/ۚۨ᩵;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()I
    .locals 1

    .line 312
    iget v0, p0, Ll/ۚۨ᩵;->᩸:I

    return v0
.end method
