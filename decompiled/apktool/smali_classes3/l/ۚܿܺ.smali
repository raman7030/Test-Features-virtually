.class public final Ll/ۚܿܺ;
.super Ll/ܿᩴܺ;
.source "RBF2"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ᩶:Ll/ۚܿܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Ll/ۚܿܺ;

    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, v1}, Ll/ܿᩴܺ;-><init>(I)V

    .line 31
    sput-object v0, Ll/ۚܿܺ;->᩶:Ll/ۚܿܺ;

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 26
    check-cast p1, Ll/ۚܿܺ;

    invoke-virtual {p0, p1}, Ll/ۚܿܺ;->֫(Ll/ۚܿܺ;)I

    move-result p1

    return p1
.end method

.method public final ֨()Z
    .locals 2

    .line 109
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 51
    invoke-virtual {p0, v0}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܿܺ;

    .line 116
    invoke-virtual {v0}, Ll/֡ܿܺ;->ܽۧ()Ll/۫ܺܺ;

    move-result-object v0

    sget-object v1, Ll/۫ܺܺ;->ܿ֫:Ll/۫ܺܺ;

    invoke-virtual {v0, v1}, Ll/۫ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۚܿܺ;)I
    .locals 7

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    .line 150
    :cond_0
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 151
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v2

    .line 152
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 51
    invoke-virtual {p0, v4}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܿܺ;

    invoke-virtual {p1, v4}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ܿܺ;

    .line 157
    invoke-virtual {v5, v6}, Ll/֡ܿܺ;->֫(Ll/֡ܿܺ;)I

    move-result v5

    if-eqz v5, :cond_1

    return v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-ge v1, v2, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-le v1, v2, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    .line 59
    invoke-virtual {p0, v0, v0}, Ll/ۚܿܺ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILl/۫ܺܺ;I)V
    .locals 1

    .line 127
    new-instance v0, Ll/֡ܿܺ;

    invoke-direct {v0, p2, p3}, Ll/֡ܿܺ;-><init>(Ll/۫ܺܺ;I)V

    invoke-virtual {p0, p1, v0}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 73
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 75
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "catch "

    .line 77
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, v1, :cond_3

    .line 51
    invoke-virtual {p0, p2}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܿܺ;

    if-eqz p2, :cond_0

    const-string v3, ",\n"

    const-string v4, "  "

    .line 0
    invoke-static {v0, v3, p1, v4}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v3, v1, -0x1

    if-ne p2, v3, :cond_1

    .line 88
    invoke-virtual {p0}, Ll/ۚܿܺ;->֨()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "<any>"

    .line 89
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {v2}, Ll/֡ܿܺ;->ܽۧ()Ll/۫ܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫ܺܺ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v3, " -> "

    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    invoke-virtual {v2}, Ll/֡ܿܺ;->֫()I

    move-result v2

    int-to-char v3, v2

    if-ne v2, v3, :cond_2

    .line 104
    invoke-static {v2}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 106
    :cond_2
    invoke-static {v2}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v2

    .line 95
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 98
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
