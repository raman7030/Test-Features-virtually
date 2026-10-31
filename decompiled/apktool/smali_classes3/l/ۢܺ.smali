.class public Ll/ۢܺ;
.super Ljava/lang/Object;
.source "K51P"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Landroid/text/StaticLayout$Builder;Landroid/widget/TextView;)V
    .locals 0

    return-void
.end method

.method public ֫(Landroid/widget/TextView;)Z
    .locals 2

    const-string v0, "getHorizontallyScrolling"

    .line 110
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, p1, v1}, Ll/ۡܺ;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
