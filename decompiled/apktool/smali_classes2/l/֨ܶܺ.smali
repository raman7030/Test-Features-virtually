.class public final synthetic Ll/֨ܶܺ;
.super Ljava/lang/Object;
.source "O3OZ"

# interfaces
.implements Ll/ۙܶܺ;


# instance fields
.field public final synthetic ֫:Ll/᩻ܶܺ;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ܶܺ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܶܺ;->֫:Ll/᩻ܶܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܶܺ;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/֨ܶܺ;->֫:Ll/᩻ܶܺ;

    .line 221
    invoke-virtual {v0, p2}, Ll/᩻ܶܺ;->֫(Ljava/lang/CharSequence;)Ll/ܳܶܺ;

    move-result-object v0

    .line 222
    new-instance v1, Ll/᩸ܶܺ;

    invoke-direct {v1, p1, p2, v0}, Ll/᩸ܶܺ;-><init>(Ll/ۗܶܺ;Ljava/lang/CharSequence;Ll/ܳܶܺ;)V

    return-object v1
.end method
