.class public final Ll/۫ܿܽ;
.super Ljava/util/HashMap;
.source "0BJU"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴܿܽ;)I
    .locals 1

    .line 16
    invoke-virtual {p1}, Ll/ᩴܿܽ;->getType()Ll/᩶ܿܽ;

    move-result-object v0

    invoke-virtual {p1}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/᩶ܿܽ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
