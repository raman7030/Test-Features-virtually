.class public final Ll/۫۬ۢ;
.super Ljava/lang/Object;
.source "46PA"


# instance fields
.field public final ֫:Ll/ᩳ۫ۢ;

.field public final ۧ:Ll/֡۫ۢ;

.field public final ܽ:Ljava/util/ArrayList;

.field public final ᩳ:Ll/֫ܳ֡;


# direct methods
.method public constructor <init>(Ll/֫ܳ֡;Ll/֡۫ۢ;Ll/ܿ۫ۢ;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p1, p0, Ll/۫۬ۢ;->ᩳ:Ll/֫ܳ֡;

    .line 118
    iput-object p2, p0, Ll/۫۬ۢ;->ۧ:Ll/֡۫ۢ;

    .line 119
    iget-object p1, p3, Ll/ܿ۫ۢ;->ܳ:Ljava/util/ArrayList;

    iput-object p1, p0, Ll/۫۬ۢ;->ܽ:Ljava/util/ArrayList;

    .line 120
    iget-object p1, p3, Ll/ܿ۫ۢ;->ᩳ:Ll/ܽ۫ۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Ll/֡۫ۢ;->ۢ:Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/ܽ۫ۢ;->֫(I)Ll/ᩳ۫ۢ;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/۫۬ۢ;->֫:Ll/ᩳ۫ۢ;

    return-void
.end method
