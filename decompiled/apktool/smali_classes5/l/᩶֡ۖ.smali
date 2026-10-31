.class public final Ll/᩶֡ۖ;
.super Ljava/lang/Object;
.source "W9PP"

# interfaces
.implements Ll/᩹֡ۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    check-cast p1, Ll/᩻֡ۖ;

    invoke-interface {p1}, Ll/᩻֡ۖ;->toBuilder()Ll/ܳ֡ۖ;

    move-result-object p1

    invoke-interface {p1}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    return-object p1
.end method
