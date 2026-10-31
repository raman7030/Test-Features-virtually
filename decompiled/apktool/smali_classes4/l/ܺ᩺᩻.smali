.class public final Ll/ܺ᩺᩻;
.super Ljava/lang/Object;
.source "W7A7"


# instance fields
.field public final ֫:Z

.field public final ۧ:Z

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZ)V
    .locals 0

    .line 828
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 829
    iput-object p1, p0, Ll/ܺ᩺᩻;->ܽ:Ljava/lang/String;

    .line 830
    iput-boolean p2, p0, Ll/ܺ᩺᩻;->ۧ:Z

    .line 831
    iput-boolean p3, p0, Ll/ܺ᩺᩻;->֫:Z

    return-void
.end method

.method public static ֫(Z)Ll/ܺ᩺᩻;
    .locals 3

    .line 845
    new-instance v0, Ll/ܺ᩺᩻;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0}, Ll/ܺ᩺᩻;-><init>(Ljava/lang/String;ZZ)V

    return-object v0
.end method
