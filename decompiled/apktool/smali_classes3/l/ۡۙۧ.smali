.class public final Ll/ۡۙۧ;
.super Ll/ۢ۬ۧ;
.source "34UR"


# instance fields
.field public final synthetic ֫:Ll/ۘۙۧ;


# direct methods
.method public constructor <init>(Ll/ۘۙۧ;)V
    .locals 0

    .line 130
    iput-object p1, p0, Ll/ۡۙۧ;->֫:Ll/ۘۙۧ;

    invoke-direct {p0}, Ll/ۢ۬ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrolled(Ll/۬۬ۧ;II)V
    .locals 0

    .line 133
    invoke-virtual {p1}, Ll/۬۬ۧ;->computeHorizontalScrollOffset()I

    move-result p2

    .line 134
    invoke-virtual {p1}, Ll/۬۬ۧ;->computeVerticalScrollOffset()I

    move-result p1

    .line 133
    iget-object p3, p0, Ll/ۡۙۧ;->֫:Ll/ۘۙۧ;

    invoke-virtual {p3, p2, p1}, Ll/ۘۙۧ;->֫(II)V

    return-void
.end method
