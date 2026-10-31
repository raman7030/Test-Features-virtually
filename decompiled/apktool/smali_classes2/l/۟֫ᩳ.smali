.class public final synthetic Ll/۟֫ᩳ;
.super Ljava/lang/Object;
.source "150C"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟֫ᩳ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/᩶֫ᩳ;

    .line 4
    check-cast p2, Ll/᩶֫ᩳ;

    .line 33
    invoke-virtual {p1}, Ll/᩶֫ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    .line 34
    invoke-virtual {p2}, Ll/᩶֫ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    .line 35
    iget-object v0, p0, Ll/۟֫ᩳ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 37
    :cond_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 39
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
