.class public final Ll/ܿܽܽ;
.super Ljava/lang/Object;
.source "XAL0"


# instance fields
.field public final ֫:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ܿܽܽ;->֫:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 55
    const-class v0, Ll/ܿܽܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    check-cast p1, Ll/ܿܽܽ;

    .line 57
    iget-object v0, p0, Ll/ܿܽܽ;->֫:Ljava/lang/Object;

    iget-object p1, p1, Ll/ܿܽܽ;->֫:Ljava/lang/Object;

    .line 169
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ܿܽܽ;->֫:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const/16 v5, 0x38

    .line 46
    iget-object v0, p0, Ll/ܿܽܽ;->֫:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    const-string v1, ", "

    const-string v2, "WindowLayoutInfo{ DisplayFeatures["

    const-string v3, "] }"

    const/4 v4, 0x0

    invoke-static/range {v0 .. v5}, Ll/֫ܶ᩵;->֫(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܺ᩹᩵;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ܿܽܽ;->֫:Ljava/lang/Object;

    return-object v0
.end method
