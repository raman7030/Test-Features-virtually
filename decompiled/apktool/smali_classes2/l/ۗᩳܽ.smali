.class public final synthetic Ll/ۗᩳܽ;
.super Ljava/lang/Object;
.source "261X"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗᩳܽ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    iget v0, p0, Ll/ۗᩳܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 9
    check-cast p2, Ljava/lang/String;

    .line 252
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast p1, Ll/ܶ᩵ܿ;

    check-cast p2, Ll/ܶ᩵ܿ;

    .line 766
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 0
    :pswitch_1
    check-cast p1, Ll/ۜ᩻ܽ;

    check-cast p2, Ll/ۜ᩻ܽ;

    .line 208
    invoke-interface {p1}, Ll/ۜ᩻ܽ;->ۘۧ()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Ll/ۜ᩻ܽ;->ۘۧ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const-string v0, "type-info"

    .line 254
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    .line 256
    :cond_1
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    .line 258
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
