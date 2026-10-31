.class public final Ll/᩷ܿۧ;
.super Ljava/lang/Object;
.source "J8IS"


# instance fields
.field public final ֫:Ll/۬᩵֫;

.field public final ۧ:[I


# direct methods
.method public constructor <init>(ILl/۬᩵֫;[I)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    array-length p1, p3

    if-nez p1, :cond_0

    .line 73
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    const-string v0, "Empty tracks are not allowed"

    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    :cond_0
    iput-object p2, p0, Ll/᩷ܿۧ;->֫:Ll/۬᩵֫;

    .line 76
    iput-object p3, p0, Ll/᩷ܿۧ;->ۧ:[I

    return-void
.end method
