.class public final Ll/ۛۗۡ;
.super Ll/ۖ᩹ۢ;
.source "Y1UK"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public final ۧ:[Ll/᩹ۗۡ;


# direct methods
.method public varargs constructor <init>([Ll/᩹ۗۡ;)V
    .locals 1

    const/4 v0, 0x2

    .line 14
    invoke-direct {p0, v0}, Ll/ۖ᩹ۢ;-><init>(I)V

    iput-object p1, p0, Ll/ۛۗۡ;->ۧ:[Ll/᩹ۗۡ;

    return-void
.end method

.method private ܽ(Ljava/lang/String;)Ll/᩶ۗۡ;
    .locals 4

    .line 59
    iget-object v0, p0, Ll/ۛۗۡ;->ۧ:[Ll/᩹ۗۡ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 60
    invoke-virtual {v3, p1}, Ll/᩹ۗۡ;->ۧ(Ljava/lang/String;)Ll/᩶ۗۡ;

    move-result-object v3

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 2

    .line 21
    invoke-virtual {p0, p1}, Ll/ۛۗۡ;->ۧ(Ll/ۗۗۡ;)V

    .line 20
    invoke-virtual {p1}, Ll/ۗۗۡ;->ۢ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 22
    invoke-static {v0}, Ll/ۢۤۡ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-direct {p0, v0}, Ll/ۛۗۡ;->ܽ(Ljava/lang/String;)Ll/᩶ۗۡ;

    move-result-object v0

    .line 24
    instance-of v1, v0, Ll/ۗۗۡ;

    if-eqz v1, :cond_0

    .line 25
    check-cast v0, Ll/ۗۗۡ;

    invoke-virtual {p1, v0}, Ll/ۗۗۡ;->ۧ(Ll/ۗۗۡ;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۗۗۡ;)V
    .locals 2

    .line 42
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ۜ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 43
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۛۗۡ;->ܽ(Ljava/lang/String;)Ll/᩶ۗۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {p1, v0}, Ll/᩶ۗۡ;->ۧ(Ll/᩶ۗۡ;)V

    .line 46
    invoke-virtual {v0, p1}, Ll/᩶ۗۡ;->֫(Ll/ۗۗۡ;)V

    .line 49
    :cond_0
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ᩳ()Ll/ܿ۬ۡ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 50
    invoke-direct {p0, v1}, Ll/ۛۗۡ;->ܽ(Ljava/lang/String;)Ll/᩶ۗۡ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 52
    invoke-virtual {p1, v1}, Ll/᩶ۗۡ;->֫(Ll/᩶ۗۡ;)V

    .line 53
    invoke-virtual {v1, p1}, Ll/᩶ۗۡ;->֫(Ll/ۗۗۡ;)V

    goto :goto_0

    :cond_2
    return-void
.end method
