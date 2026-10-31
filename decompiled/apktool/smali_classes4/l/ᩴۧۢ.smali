.class public final Ll/ᩴۧۢ;
.super Ljava/lang/Object;
.source "31WU"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ۗ:Ll/ۨۘܽ;


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:I

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "[0-9]+"

    .line 11
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ᩴۧۢ;->ۗ:Ll/ۨۘܽ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/ᩴۧۢ;->᩸:Ljava/lang/String;

    .line 19
    sget-object v0, Ll/ᩴۧۢ;->ۗ:Ll/ۨۘܽ;

    invoke-virtual {v0, p1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v1

    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v2

    sub-int/2addr v1, v2

    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ᩴۧۢ;->᩹:Ljava/lang/String;

    .line 22
    invoke-virtual {v0}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Ll/ᩴۧۢ;->᩶:I

    .line 23
    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴۧۢ;->ۙ:Ljava/lang/String;

    return-void

    .line 25
    :cond_0
    iput-object p1, p0, Ll/ᩴۧۢ;->᩹:Ljava/lang/String;

    const/4 p1, -0x1

    .line 26
    iput p1, p0, Ll/ᩴۧۢ;->᩶:I

    const-string p1, ""

    .line 27
    iput-object p1, p0, Ll/ᩴۧۢ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 4

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 47
    new-instance v3, Ll/ᩴۧۢ;

    invoke-direct {v3, v2}, Ll/ᩴۧۢ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 49
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 v1, 0x0

    .line 50
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۧۢ;

    iget-object v2, v2, Ll/ᩴۧۢ;->᩸:Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 10
    check-cast p1, Ll/ᩴۧۢ;

    .line 33
    iget-object v0, p0, Ll/ᩴۧۢ;->᩹:Ljava/lang/String;

    iget-object v1, p1, Ll/ᩴۧۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 37
    :cond_0
    iget v0, p0, Ll/ᩴۧۢ;->᩶:I

    iget v1, p1, Ll/ᩴۧۢ;->᩶:I

    sub-int/2addr v0, v1

    if-eqz v0, :cond_1

    return v0

    .line 41
    :cond_1
    iget-object v0, p0, Ll/ᩴۧۢ;->ۙ:Ljava/lang/String;

    iget-object p1, p1, Ll/ᩴۧۢ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
