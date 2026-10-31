.class public abstract Ll/ۘۙ᩷;
.super Ll/֫᩸ۧ;
.source "85PM"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public abstract ֫(Ll/ۗܺ᩷;)V
.end method

.method public final ۛ()V
    .locals 1

    .line 34
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    invoke-virtual {p0, v0}, Ll/ۘۙ᩷;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ۜ֫()Landroid/content/SharedPreferences;
    .locals 1

    .line 41
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֡()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
