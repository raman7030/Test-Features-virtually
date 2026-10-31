.class public final Ll/ۘ᩷ۖ;
.super Ljava/lang/Object;
.source "M9PM"


# instance fields
.field public ֫:[Ll/۬֡ۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 701
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [Ll/۬֡ۖ;

    .line 702
    iput-object v0, p0, Ll/ۘ᩷ۖ;->֫:[Ll/۬֡ۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;Ll/ܶۖۖ;)Ll/۬֡ۖ;
    .locals 3

    .line 705
    invoke-virtual {p2}, Ll/ܶۖۖ;->֡()I

    move-result v0

    .line 706
    iget-object v1, p0, Ll/ۘ᩷ۖ;->֫:[Ll/۬֡ۖ;

    array-length v2, v1

    if-lt v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x2

    .line 708
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/۬֡ۖ;

    iput-object v1, p0, Ll/ۘ᩷ۖ;->֫:[Ll/۬֡ۖ;

    .line 710
    :cond_0
    iget-object v1, p0, Ll/ۘ᩷ۖ;->֫:[Ll/۬֡ۖ;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    .line 719
    invoke-virtual {p2}, Ll/ܶۖۖ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "_"

    .line 0
    invoke-static {p2, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Case_"

    invoke-static {p2, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 723
    new-instance v2, Ll/۬֡ۖ;

    .line 724
    invoke-static {p1, p2}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    invoke-static {p1, v1}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-direct {v2, p2, p1}, Ll/۬֡ۖ;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 713
    iget-object p1, p0, Ll/ۘ᩷ۖ;->֫:[Ll/۬֡ۖ;

    aput-object v2, p1, v0

    return-object v2

    :cond_1
    return-object v1
.end method
