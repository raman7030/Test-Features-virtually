.class public final Ll/֨᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ll/ۖۤᩳ;


# instance fields
.field public final synthetic ֫:Ll/֫ۢᩳ;

.field public final synthetic ۧ:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/֫ۢᩳ;Landroid/view/View;)V
    .locals 0

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩷ᩳ;->֫:Ll/֫ۢᩳ;

    iput-object p2, p0, Ll/֨᩷ᩳ;->ۧ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/view/View;
    .locals 2

    const v0, 0x7f0a04cf

    .line 295
    iget-object v1, p0, Ll/֨᩷ᩳ;->ۧ:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 300
    iget-object v0, p0, Ll/֨᩷ᩳ;->֫:Ll/֫ۢᩳ;

    invoke-static {v0}, Ll/֫ۢᩳ;->֨(Ll/֫ۢᩳ;)V

    .line 301
    invoke-static {v0}, Ll/֫ۢᩳ;->۠(Ll/֫ۢᩳ;)V

    return-void
.end method
