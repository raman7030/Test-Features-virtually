.class public final Ll/ۧۡܿ;
.super Ljava/lang/Object;
.source "O700"

# interfaces
.implements Ll/۫ۡܿ;


# instance fields
.field public final synthetic ֫:Ll/᩷ۡܿ;

.field public final synthetic ۧ:Ll/۫ۨᩳ;


# direct methods
.method public constructor <init>(Ll/᩷ۡܿ;Ll/۫ۨᩳ;)V
    .locals 0

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۡܿ;->֫:Ll/᩷ۡܿ;

    iput-object p2, p0, Ll/ۧۡܿ;->ۧ:Ll/۫ۨᩳ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ۧۡܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method
