.class public final Ll/᩸ۗ᩻;
.super Ljava/lang/Object;
.source "B784"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    iput-object p1, p0, Ll/᩸ۗ᩻;->֫:Ljava/lang/String;

    .line 210
    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۗ᩻;->ۧ:[B

    return-void
.end method
