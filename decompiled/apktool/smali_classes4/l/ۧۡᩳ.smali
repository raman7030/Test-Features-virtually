.class public final synthetic Ll/ۧۡᩳ;
.super Ljava/lang/Object;
.source "M1X3"

# interfaces
.implements Ll/֫ۛ;


# instance fields
.field public final synthetic ֫:Ll/ܿܽۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ܿܽۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۡᩳ;->֫:Ll/ܿܽۚ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 151
    new-instance v0, Ll/᩸ۤ֡;

    .line 152
    iget-object v1, p0, Ll/ۧۡᩳ;->֫:Ll/ܿܽۚ;

    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v2

    .line 153
    invoke-interface {v1}, Ll/ܽۧۚ;->ᩴ()I

    move-result v3

    .line 154
    invoke-interface {v1}, Ll/ۜۧۚ;->᩻()I

    move-result v4

    .line 155
    invoke-interface {v1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v1

    invoke-direct {v0, v2, v3, v4, v1}, Ll/᩸ۤ֡;-><init>(Ll/֨ۗ֡;IILl/۠ܽۚ;)V

    return-object v0
.end method
