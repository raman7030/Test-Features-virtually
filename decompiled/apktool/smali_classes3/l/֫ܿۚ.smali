.class public final Ll/֫ܿۚ;
.super Ll/ܶ۬֡;
.source "L5MW"

# interfaces
.implements Ll/ܿܿۚ;


# static fields
.field public static final ᩶:Ll/֫ܿۚ;

.field public static final ᩹:Ll/֫ܿۚ;


# instance fields
.field public final ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 38
    new-instance v0, Ll/֫ܿۚ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/֫ܿۚ;-><init>(Z)V

    sput-object v0, Ll/֫ܿۚ;->᩶:Ll/֫ܿۚ;

    .line 39
    new-instance v0, Ll/֫ܿۚ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/֫ܿۚ;-><init>(Z)V

    sput-object v0, Ll/֫ܿۚ;->᩹:Ll/֫ܿۚ;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/֫ܿۚ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final getValue()Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Ll/֫ܿۚ;->᩸:Z

    return v0
.end method
