.class public final Ll/ܺۢ;
.super Landroid/database/DataSetObserver;
.source "S696"


# instance fields
.field public final synthetic ֫:Ll/۠ۢ;


# direct methods
.method public constructor <init>(Ll/۠ۢ;)V
    .locals 0

    .line 134
    iput-object p1, p0, Ll/ܺۢ;->֫:Ll/۠ۢ;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 1

    .line 138
    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 139
    iget-object v0, p0, Ll/ܺۢ;->֫:Ll/۠ۢ;

    iget-object v0, v0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    .line 143
    invoke-super {p0}, Landroid/database/DataSetObserver;->onInvalidated()V

    .line 144
    iget-object v0, p0, Ll/ܺۢ;->֫:Ll/۠ۢ;

    iget-object v0, v0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method
