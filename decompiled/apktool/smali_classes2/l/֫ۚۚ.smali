.class public final Ll/֫ۚۚ;
.super Ljava/lang/Object;
.source "X4TD"


# static fields
.field public static final ܽ:Ljava/lang/String;

.field public static final ܿ:Ll/֫ۚۚ;

.field public static final ᩳ:Ljava/lang/String;


# instance fields
.field public final ֫:Ll/۟֡ۚ;

.field public final ۧ:Ll/۟֡ۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "jsoup.sourceRange"

    .line 15
    invoke-static {v0}, Ll/ܺ֡ۚ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/֫ۚۚ;->ᩳ:Ljava/lang/String;

    const-string v0, "jsoup.endSourceRange"

    .line 16
    invoke-static {v0}, Ll/ܺ֡ۚ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/֫ۚۚ;->ܽ:Ljava/lang/String;

    .line 17
    new-instance v0, Ll/۟֡ۚ;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1, v1}, Ll/۟֡ۚ;-><init>(III)V

    .line 18
    new-instance v1, Ll/֫ۚۚ;

    invoke-direct {v1, v0, v0}, Ll/֫ۚۚ;-><init>(Ll/۟֡ۚ;Ll/۟֡ۚ;)V

    sput-object v1, Ll/֫ۚۚ;->ܿ:Ll/֫ۚۚ;

    return-void
.end method

.method public constructor <init>(Ll/۟֡ۚ;Ll/۟֡ۚ;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Ll/֫ۚۚ;->ۧ:Ll/۟֡ۚ;

    .line 27
    iput-object p2, p0, Ll/֫ۚۚ;->֫:Ll/۟֡ۚ;

    return-void
.end method

.method public static ۧ(Ll/ۨ֡ۚ;Z)Ll/֫ۚۚ;
    .locals 1

    if-eqz p1, :cond_0

    .line 61
    sget-object p1, Ll/֫ۚۚ;->ᩳ:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object p1, Ll/֫ۚۚ;->ܽ:Ljava/lang/String;

    .line 62
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۨ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 63
    sget-object p0, Ll/֫ۚۚ;->ܿ:Ll/֫ۚۚ;

    return-object p0

    .line 65
    :cond_1
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/ܺ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    check-cast p0, Ll/֫ۚۚ;

    return-object p0

    .line 54
    :cond_2
    new-instance p0, Ll/ܳ֡ۚ;

    const-string p1, "Object must not be null"

    .line 14
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 80
    const-class v1, Ll/֫ۚۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 82
    :cond_1
    check-cast p1, Ll/֫ۚۚ;

    .line 84
    iget-object v1, p0, Ll/֫ۚۚ;->ۧ:Ll/۟֡ۚ;

    iget-object v2, p1, Ll/֫ۚۚ;->ۧ:Ll/۟֡ۚ;

    invoke-virtual {v1, v2}, Ll/۟֡ۚ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    .line 85
    :cond_2
    iget-object v0, p0, Ll/֫ۚۚ;->֫:Ll/۟֡ۚ;

    iget-object p1, p1, Ll/֫ۚۚ;->֫:Ll/۟֡ۚ;

    invoke-virtual {v0, p1}, Ll/۟֡ۚ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 90
    iget-object v0, p0, Ll/֫ۚۚ;->ۧ:Ll/۟֡ۚ;

    invoke-virtual {v0}, Ll/۟֡ۚ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 91
    iget-object v1, p0, Ll/֫ۚۚ;->֫:Ll/۟֡ۚ;

    invoke-virtual {v1}, Ll/۟֡ۚ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 101
    iget-object v0, p0, Ll/֫ۚۚ;->ۧ:Ll/۟֡ۚ;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/֫ۚۚ;->֫:Ll/۟֡ۚ;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "-"

    .line 0
    invoke-static {v0, v2, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/۟֡ۚ;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/֫ۚۚ;->֫:Ll/۟֡ۚ;

    return-object v0
.end method

.method public final ֫(Ll/ۨ֡ۚ;Z)V
    .locals 0

    .line 74
    invoke-virtual {p1}, Ll/ۨ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object p1

    if-eqz p2, :cond_0

    sget-object p2, Ll/֫ۚۚ;->ᩳ:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object p2, Ll/֫ۚۚ;->ܽ:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, p2, p0}, Ll/ܺ֡ۚ;->֫(Ljava/lang/String;Ll/֫ۚۚ;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 51
    sget-object v0, Ll/֫ۚۚ;->ܿ:Ll/֫ۚۚ;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/۟֡ۚ;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/֫ۚۚ;->ۧ:Ll/۟֡ۚ;

    return-object v0
.end method
