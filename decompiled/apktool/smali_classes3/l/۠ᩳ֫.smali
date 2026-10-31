.class public final Ll/۠ᩳ֫;
.super Ljava/lang/Object;
.source "RB0P"

# interfaces
.implements Ll/֨ᩳ֫;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 980
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 981
    iput-object p1, p0, Ll/۠ᩳ֫;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final ֫(Ljava/lang/CharSequence;IILl/֫ܿ֫;)Z
    .locals 0

    .line 987
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    iget-object p2, p0, Ll/۠ᩳ֫;->֫:Ljava/lang/String;

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 988
    invoke-virtual {p4}, Ll/֫ܿ֫;->᩷()V

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
