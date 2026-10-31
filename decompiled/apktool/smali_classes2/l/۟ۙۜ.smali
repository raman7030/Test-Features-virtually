.class public final synthetic Ll/۟ۙۜ;
.super Ljava/lang/Object;
.source "N7FV"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/۟ۙۜ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 2
    check-cast p1, Ll/ۧۗۜ;

    .line 4
    check-cast p2, Ll/ۧۗۜ;

    .line 58
    invoke-virtual {p1}, Ll/ۧۗۜ;->ܳ()Z

    move-result v0

    invoke-virtual {p2}, Ll/ۧۗۜ;->ܳ()Z

    move-result v1

    if-eq v0, v1, :cond_1

    .line 59
    invoke-virtual {p1}, Ll/ۧۗۜ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 61
    :cond_1
    invoke-virtual {p1}, Ll/ۧۗۜ;->ᩳ()I

    move-result v0

    invoke-virtual {p2}, Ll/ۧۗۜ;->ᩳ()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    .line 65
    :cond_2
    invoke-virtual {p1}, Ll/ۧۗۜ;->֫()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 147
    iget-boolean v1, p0, Ll/۟ۙۜ;->᩸:Z

    if-eqz v1, :cond_3

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 66
    :cond_3
    invoke-virtual {p2}, Ll/ۧۗۜ;->֫()Ll/ᩳۜܳ;

    move-result-object v2

    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_4

    .line 147
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 67
    :cond_4
    invoke-virtual {v0, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_5

    return v0

    .line 71
    :cond_5
    invoke-virtual {p1}, Ll/ۧۗۜ;->֫()Ll/ᩳۜܳ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۧۗۜ;->֫()Ll/ᩳۜܳ;

    move-result-object p2

    invoke-interface {p2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
