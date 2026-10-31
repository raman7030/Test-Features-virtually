.class public final synthetic Ll/ܳۙ֫;
.super Ljava/lang/Object;
.source "M8TF"

# interfaces
.implements Ll/ܽܶܺ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ܳۙ֫;->᩸:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Integer;

    .line 3214
    iget p1, p0, Ll/ܳۙ֫;->᩸:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
