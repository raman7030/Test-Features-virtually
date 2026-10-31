.class public final synthetic Ll/᩵ۧۧ;
.super Ljava/lang/Object;
.source "Q8T9"

# interfaces
.implements Ll/᩻ۚ֫;


# instance fields
.field public final synthetic ᩶:Ll/ۜۧۧ;

.field public final synthetic ᩸:Ll/۠ۧۧ;

.field public final synthetic ᩹:Ll/ۧۧۧ;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۧۧ;->᩸:Ll/۠ۧۧ;

    iput-object p2, p0, Ll/᩵ۧۧ;->᩹:Ll/ۧۧۧ;

    iput-object p3, p0, Ll/᩵ۧۧ;->᩶:Ll/ۜۧۧ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/ܶۧۧ;

    .line 398
    iget-object v0, p0, Ll/᩵ۧۧ;->᩸:Ll/۠ۧۧ;

    iget v1, v0, Ll/۠ۧۧ;->ܽ:I

    iget-object v0, v0, Ll/۠ۧۧ;->ۧ:Ll/ܺۧۧ;

    iget-object v2, p0, Ll/᩵ۧۧ;->᩹:Ll/ۧۧۧ;

    iget-object v3, p0, Ll/᩵ۧۧ;->᩶:Ll/ۜۧۧ;

    invoke-interface {p1, v1, v0, v2, v3}, Ll/ܶۧۧ;->֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V

    return-void
.end method
