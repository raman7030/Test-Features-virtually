.class public final synthetic Ll/ܽܳܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ljava/util/List;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:Ll/᩻ܳܿ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILl/᩻ܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܳܿ;->֫:Ljava/util/List;

    iput p2, p0, Ll/ܽܳܿ;->ۧ:I

    iput-object p3, p0, Ll/ܽܳܿ;->ܽ:Ll/᩻ܳܿ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ܶܳܿ;

    .line 1137
    iget v0, p0, Ll/ܽܳܿ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll/ܽܳܿ;->֫:Ljava/util/List;

    invoke-interface {v1, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1138
    iget-object p1, p0, Ll/ܽܳܿ;->ܽ:Ll/᩻ܳܿ;

    iget-object v1, p1, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {v1, v0}, Ll/᩶ۗۧ;->notifyItemInserted(I)V

    .line 1139
    iget-object p1, p1, Ll/᩻ܳܿ;->᩷:Ll/۬۬ۧ;

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->smoothScrollToPosition(I)V

    .line 1140
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    return-void
.end method
