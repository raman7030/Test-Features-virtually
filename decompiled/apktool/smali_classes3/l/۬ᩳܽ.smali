.class public final synthetic Ll/۬ᩳܽ;
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
    iput p1, p0, Ll/۬ᩳܽ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 2
    iget v0, p0, Ll/۬ᩳܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 9
    check-cast p2, Ljava/lang/String;

    .line 106
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p2, p1

    return p2

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۜ᩻ܽ;

    check-cast p2, Ll/ۜ᩻ܽ;

    .line 211
    invoke-interface {p1}, Ll/ۜ᩻ܽ;->ۘۧ()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Ll/ۜ᩻ܽ;->ۘۧ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
