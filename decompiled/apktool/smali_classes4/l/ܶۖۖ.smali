.class public final Ll/ܶۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"


# instance fields
.field public ۗ:[Ll/֡ۖۖ;

.field public ۙ:I

.field public ۛ:Ll/ۘܺۖ;

.field public final ۤ:I

.field public final ۫:Ljava/lang/String;

.field public final ۬:Ll/ۚۖۖ;

.field public ᩶:Ll/ᩳۖۖ;


# direct methods
.method public constructor <init>(Ll/ۘܺۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;I)V
    .locals 1

    const/4 v0, 0x0

    .line 3336
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    .line 3337
    iput-object p3, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 3338
    iput-object p1, p0, Ll/ܶۖۖ;->ۛ:Ll/ۘܺۖ;

    .line 3339
    invoke-virtual {p1}, Ll/ۘܺۖ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p3, p1}, Ll/᩹ۖۖ;->֫(Ll/ۚۖۖ;Ll/ᩳۖۖ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۖۖ;->۫:Ljava/lang/String;

    .line 3340
    iput-object p2, p0, Ll/ܶۖۖ;->۬:Ll/ۚۖۖ;

    .line 3341
    iput p4, p0, Ll/ܶۖۖ;->ۤ:I

    .line 3343
    iput-object p3, p0, Ll/ܶۖۖ;->᩶:Ll/ᩳۖۖ;

    .line 3344
    iput v0, p0, Ll/ܶۖۖ;->ۙ:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܶۖۖ;[Ll/֡ۖۖ;)V
    .locals 0

    .line 3256
    iput-object p1, p0, Ll/ܶۖۖ;->ۗ:[Ll/֡ۖۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܶۖۖ;)[Ll/֡ۖۖ;
    .locals 0

    .line 3256
    iget-object p0, p0, Ll/ܶۖۖ;->ۗ:[Ll/֡ۖۖ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ܶۖۖ;)V
    .locals 1

    const/4 v0, 0x0

    .line 3256
    iput v0, p0, Ll/ܶۖۖ;->ۙ:I

    return-void
.end method

.method public static synthetic ܽ(Ll/ܶۖۖ;)I
    .locals 2

    .line 3256
    iget v0, p0, Ll/ܶۖۖ;->ۙ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܶۖۖ;->ۙ:I

    return v0
.end method

.method public static ᩳ(Ll/ܶۖۖ;)V
    .locals 1

    .line 3323
    iget-object v0, p0, Ll/ܶۖۖ;->ۛ:Ll/ۘܺۖ;

    invoke-virtual {v0}, Ll/ۘܺۖ;->ۜ()Ll/֡ܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ܺۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨ۖۖ;->֫(Ll/ۛۢۖ;)V

    return-void
.end method


# virtual methods
.method public final getFields()Ljava/util/List;
    .locals 1

    .line 3305
    iget-object v0, p0, Ll/ܶۖۖ;->ۗ:[Ll/֡ۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 3264
    iget-object v0, p0, Ll/ܶۖۖ;->ۛ:Ll/ۘܺۖ;

    invoke-virtual {v0}, Ll/ۘܺۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()I
    .locals 1

    .line 3259
    iget v0, p0, Ll/ܶۖۖ;->ۤ:I

    return v0
.end method

.method public final ۚ()Z
    .locals 4

    .line 3318
    iget-object v0, p0, Ll/ܶۖۖ;->ۗ:[Ll/֡ۖۖ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    aget-object v0, v0, v2

    invoke-static {v0}, Ll/֡ۖۖ;->ܽ(Ll/֡ۖۖ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    return v2
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 3314
    iget-object v0, p0, Ll/ܶۖۖ;->ۛ:Ll/ۘܺۖ;

    return-object v0
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 1

    .line 3269
    iget-object v0, p0, Ll/ܶۖۖ;->۬:Ll/ۚۖۖ;

    return-object v0
.end method

.method public final ܺ()Ll/ᩳۖۖ;
    .locals 1

    .line 3278
    iget-object v0, p0, Ll/ܶۖۖ;->᩶:Ll/ᩳۖۖ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 3274
    iget-object v0, p0, Ll/ܶۖۖ;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 3282
    iget v0, p0, Ll/ܶۖۖ;->ۙ:I

    return v0
.end method
