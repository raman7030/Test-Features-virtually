.class public final Ll/᩺᩺ܺ;
.super Ljava/lang/Object;
.source "B3B1"


# static fields
.field public static final ܽ:Ll/᩺᩺ܺ;

.field public static final ᩳ:Ll/᩺᩺ܺ;


# instance fields
.field public final ֫:Ljava/lang/Throwable;

.field public final ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 175
    sget-boolean v0, Ll/ۖܰܺ;->ۗ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 176
    sput-object v1, Ll/᩺᩺ܺ;->ܽ:Ll/᩺᩺ܺ;

    .line 177
    sput-object v1, Ll/᩺᩺ܺ;->ᩳ:Ll/᩺᩺ܺ;

    return-void

    .line 179
    :cond_0
    new-instance v0, Ll/᩺᩺ܺ;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩺᩺ܺ;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Ll/᩺᩺ܺ;->ܽ:Ll/᩺᩺ܺ;

    .line 180
    new-instance v0, Ll/᩺᩺ܺ;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩺᩺ܺ;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Ll/᩺᩺ܺ;->ᩳ:Ll/᩺᩺ܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Z)V
    .locals 0

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iput-boolean p2, p0, Ll/᩺᩺ܺ;->ۧ:Z

    .line 189
    iput-object p1, p0, Ll/᩺᩺ܺ;->֫:Ljava/lang/Throwable;

    return-void
.end method
