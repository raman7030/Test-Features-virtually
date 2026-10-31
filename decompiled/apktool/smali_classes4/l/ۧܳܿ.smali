.class public final synthetic Ll/ۧܳܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/ܳܳܿ;

.field public final synthetic ۧ:I


# direct methods
.method public synthetic constructor <init>(Ll/ܳܳܿ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܳܿ;->֫:Ll/ܳܳܿ;

    iput p2, p0, Ll/ۧܳܿ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/ܶܳܿ;

    .line 1083
    iget-object v0, p0, Ll/ۧܳܿ;->֫:Ll/ܳܳܿ;

    iget-object v0, v0, Ll/ܳܳܿ;->ۙ:Ll/᩻ܳܿ;

    invoke-virtual {v0}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iget v2, p0, Ll/ۧܳܿ;->ۧ:I

    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1084
    iget-object p1, v0, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {p1, v2}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 1085
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    return-void
.end method
