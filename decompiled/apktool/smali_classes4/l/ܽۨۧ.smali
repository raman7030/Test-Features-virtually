.class public abstract Ll/ܽۨۧ;
.super Ljava/lang/Object;
.source "G5Y2"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final DBG:Z = false

.field public static final DEFAULT_MATCH_ORDER:[I

.field public static final EMPTY_ANIMATOR_ARRAY:[Landroid/animation/Animator;

.field public static final LOG_TAG:Ljava/lang/String; = "Transition"

.field public static final MATCH_FIRST:I = 0x1

.field public static final MATCH_ID:I = 0x3

.field public static final MATCH_ID_STR:Ljava/lang/String; = "id"

.field public static final MATCH_INSTANCE:I = 0x1

.field public static final MATCH_INSTANCE_STR:Ljava/lang/String; = "instance"

.field public static final MATCH_ITEM_ID:I = 0x4

.field public static final MATCH_ITEM_ID_STR:Ljava/lang/String; = "itemId"

.field public static final MATCH_LAST:I = 0x4

.field public static final MATCH_NAME:I = 0x2

.field public static final MATCH_NAME_STR:Ljava/lang/String; = "name"

.field public static final STRAIGHT_PATH_MOTION:Ll/֡ۛۧ;

.field public static sRunningAnimators:Ljava/lang/ThreadLocal;


# instance fields
.field public mAnimatorCache:[Landroid/animation/Animator;

.field public mAnimators:Ljava/util/ArrayList;

.field public mCanRemoveViews:Z

.field public mCloneParent:Ll/ܽۨۧ;

.field public mCurrentAnimators:Ljava/util/ArrayList;

.field public mDuration:J

.field public mEndValues:Ll/֡ۨۧ;

.field public mEndValuesList:Ljava/util/ArrayList;

.field public mEnded:Z

.field public mEpicenterCallback:Ll/۬ۛۧ;

.field public mInterpolator:Landroid/animation/TimeInterpolator;

.field public mListeners:Ljava/util/ArrayList;

.field public mListenersCache:[Ll/ۛۛۧ;

.field public mMatchOrder:[I

.field public mName:Ljava/lang/String;

.field public mNameOverrides:Ll/ۖ᩵;

.field public mNumInstances:I

.field public mParent:Ll/ۖۨۧ;

.field public mPathMotion:Ll/֡ۛۧ;

.field public mPaused:Z

.field public mPropagation:Ll/ۜۨۧ;

.field public mSeekController:Ll/ۤۛۧ;

.field public mSeekOffsetInParent:J

.field public mStartDelay:J

.field public mStartValues:Ll/֡ۨۧ;

.field public mStartValuesList:Ljava/util/ArrayList;

.field public mTargetChildExcludes:Ljava/util/ArrayList;

.field public mTargetExcludes:Ljava/util/ArrayList;

.field public mTargetIdChildExcludes:Ljava/util/ArrayList;

.field public mTargetIdExcludes:Ljava/util/ArrayList;

.field public mTargetIds:Ljava/util/ArrayList;

.field public mTargetNameExcludes:Ljava/util/ArrayList;

.field public mTargetNames:Ljava/util/ArrayList;

.field public mTargetTypeChildExcludes:Ljava/util/ArrayList;

.field public mTargetTypeExcludes:Ljava/util/ArrayList;

.field public mTargetTypes:Ljava/util/ArrayList;

.field public mTargets:Ljava/util/ArrayList;

.field public mTotalDuration:J


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/animation/Animator;

    .line 132
    sput-object v0, Ll/ܽۨۧ;->EMPTY_ANIMATOR_ARRAY:[Landroid/animation/Animator;

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    .line 174
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ܽۨۧ;->DEFAULT_MATCH_ORDER:[I

    .line 181
    new-instance v0, Ll/᩸ۛۧ;

    invoke-direct {v0}, Ll/֡ۛۧ;-><init>()V

    sput-object v0, Ll/ܽۨۧ;->STRAIGHT_PATH_MOTION:Ll/֡ۛۧ;

    .line 217
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ܽۨۧ;->sRunningAnimators:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 289
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۨۧ;->mName:Ljava/lang/String;

    const-wide/16 v0, -0x1

    .line 194
    iput-wide v0, p0, Ll/ܽۨۧ;->mStartDelay:J

    .line 195
    iput-wide v0, p0, Ll/ܽۨۧ;->mDuration:J

    const/4 v0, 0x0

    .line 196
    iput-object v0, p0, Ll/ܽۨۧ;->mInterpolator:Landroid/animation/TimeInterpolator;

    .line 197
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    .line 198
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    .line 199
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    .line 200
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    .line 201
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetIdExcludes:Ljava/util/ArrayList;

    .line 202
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetExcludes:Ljava/util/ArrayList;

    .line 203
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetTypeExcludes:Ljava/util/ArrayList;

    .line 204
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetNameExcludes:Ljava/util/ArrayList;

    .line 205
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetIdChildExcludes:Ljava/util/ArrayList;

    .line 206
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetChildExcludes:Ljava/util/ArrayList;

    .line 207
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetTypeChildExcludes:Ljava/util/ArrayList;

    .line 208
    new-instance v1, Ll/֡ۨۧ;

    invoke-direct {v1}, Ll/֡ۨۧ;-><init>()V

    iput-object v1, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    .line 209
    new-instance v1, Ll/֡ۨۧ;

    invoke-direct {v1}, Ll/֡ۨۧ;-><init>()V

    iput-object v1, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    .line 210
    iput-object v0, p0, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    .line 211
    sget-object v1, Ll/ܽۨۧ;->DEFAULT_MATCH_ORDER:[I

    iput-object v1, p0, Ll/ܽۨۧ;->mMatchOrder:[I

    const/4 v1, 0x0

    .line 226
    iput-boolean v1, p0, Ll/ܽۨۧ;->mCanRemoveViews:Z

    .line 230
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    .line 233
    sget-object v2, Ll/ܽۨۧ;->EMPTY_ANIMATOR_ARRAY:[Landroid/animation/Animator;

    iput-object v2, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    .line 237
    iput v1, p0, Ll/ܽۨۧ;->mNumInstances:I

    .line 240
    iput-boolean v1, p0, Ll/ܽۨۧ;->mPaused:Z

    .line 244
    iput-boolean v1, p0, Ll/ܽۨۧ;->mEnded:Z

    .line 247
    iput-object v0, p0, Ll/ܽۨۧ;->mCloneParent:Ll/ܽۨۧ;

    .line 250
    iput-object v0, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    .line 254
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    .line 269
    sget-object v0, Ll/ܽۨۧ;->STRAIGHT_PATH_MOTION:Ll/֡ۛۧ;

    iput-object v0, p0, Ll/ܽۨۧ;->mPathMotion:Ll/֡ۛۧ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .line 301
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۨۧ;->mName:Ljava/lang/String;

    const-wide/16 v0, -0x1

    .line 194
    iput-wide v0, p0, Ll/ܽۨۧ;->mStartDelay:J

    .line 195
    iput-wide v0, p0, Ll/ܽۨۧ;->mDuration:J

    const/4 v0, 0x0

    .line 196
    iput-object v0, p0, Ll/ܽۨۧ;->mInterpolator:Landroid/animation/TimeInterpolator;

    .line 197
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    .line 198
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    .line 199
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    .line 200
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    .line 201
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetIdExcludes:Ljava/util/ArrayList;

    .line 202
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetExcludes:Ljava/util/ArrayList;

    .line 203
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetTypeExcludes:Ljava/util/ArrayList;

    .line 204
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetNameExcludes:Ljava/util/ArrayList;

    .line 205
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetIdChildExcludes:Ljava/util/ArrayList;

    .line 206
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetChildExcludes:Ljava/util/ArrayList;

    .line 207
    iput-object v0, p0, Ll/ܽۨۧ;->mTargetTypeChildExcludes:Ljava/util/ArrayList;

    .line 208
    new-instance v1, Ll/֡ۨۧ;

    invoke-direct {v1}, Ll/֡ۨۧ;-><init>()V

    iput-object v1, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    .line 209
    new-instance v1, Ll/֡ۨۧ;

    invoke-direct {v1}, Ll/֡ۨۧ;-><init>()V

    iput-object v1, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    .line 210
    iput-object v0, p0, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    .line 211
    sget-object v1, Ll/ܽۨۧ;->DEFAULT_MATCH_ORDER:[I

    iput-object v1, p0, Ll/ܽۨۧ;->mMatchOrder:[I

    const/4 v1, 0x0

    .line 226
    iput-boolean v1, p0, Ll/ܽۨۧ;->mCanRemoveViews:Z

    .line 230
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    .line 233
    sget-object v2, Ll/ܽۨۧ;->EMPTY_ANIMATOR_ARRAY:[Landroid/animation/Animator;

    iput-object v2, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    .line 237
    iput v1, p0, Ll/ܽۨۧ;->mNumInstances:I

    .line 240
    iput-boolean v1, p0, Ll/ܽۨۧ;->mPaused:Z

    .line 244
    iput-boolean v1, p0, Ll/ܽۨۧ;->mEnded:Z

    .line 247
    iput-object v0, p0, Ll/ܽۨۧ;->mCloneParent:Ll/ܽۨۧ;

    .line 250
    iput-object v0, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    .line 254
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    .line 269
    sget-object v0, Ll/ܽۨۧ;->STRAIGHT_PATH_MOTION:Ll/֡ۛۧ;

    iput-object v0, p0, Ll/ܽۨۧ;->mPathMotion:Ll/֡ۛۧ;

    .line 302
    sget-object v0, Ll/ܶۛۧ;->ܿ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 303
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v2, "duration"

    const/4 v3, 0x1

    const/4 v4, -0x1

    .line 304
    invoke-static {v0, p2, v2, v3, v4}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v5, 0x0

    cmp-long v7, v2, v5

    if-ltz v7, :cond_0

    .line 307
    invoke-virtual {p0, v2, v3}, Ll/ܽۨۧ;->setDuration(J)Ll/ܽۨۧ;

    :cond_0
    const-string v2, "http://schemas.android.com/apk/res/android"

    const-string v3, "startDelay"

    .line 57
    invoke-interface {p2, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v3, 0x2

    .line 107
    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    :cond_1
    int-to-long v3, v4

    cmp-long v7, v3, v5

    if-lez v7, :cond_2

    .line 312
    invoke-virtual {p0, v3, v4}, Ll/ܽۨۧ;->setStartDelay(J)Ll/ܽۨۧ;

    :cond_2
    const-string v3, "interpolator"

    .line 57
    invoke-interface {p2, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 206
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    :cond_3
    if-lez v1, :cond_4

    .line 317
    invoke-static {p1, v1}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܽۨۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ܽۨۧ;

    :cond_4
    const-string p1, "matchOrder"

    const/4 v1, 0x3

    .line 319
    invoke-static {v0, p2, p1, v1}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 322
    invoke-static {p1}, Ll/ܽۨۧ;->֫(Ljava/lang/String;)[I

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܽۨۧ;->setMatchOrder([I)V

    .line 324
    :cond_5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private ֫(Ljava/util/ArrayList;IZ)Ljava/util/ArrayList;
    .locals 0

    if-lez p2, :cond_1

    if-eqz p3, :cond_0

    .line 1405
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ۗۛۧ;->֫(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    .line 1407
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ۗۛۧ;->ۧ(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private ֫(Ljava/util/ArrayList;Landroid/view/View;Z)Ljava/util/ArrayList;
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 1420
    invoke-static {p2, p1}, Ll/ۗۛۧ;->֫(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    .line 1422
    :cond_0
    invoke-static {p2, p1}, Ll/ۗۛۧ;->ۧ(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private ֫(Ljava/util/ArrayList;Ljava/lang/Class;Z)Ljava/util/ArrayList;
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 1489
    invoke-static {p2, p1}, Ll/ۗۛۧ;->֫(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    .line 1491
    :cond_0
    invoke-static {p2, p1}, Ll/ۗۛۧ;->ۧ(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/lang/Object;Z)Ljava/util/ArrayList;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 1256
    invoke-static {p1, p0}, Ll/ۗۛۧ;->֫(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    .line 1258
    :cond_0
    invoke-static {p1, p0}, Ll/ۗۛۧ;->ۧ(Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static ֫()Ll/ۖ᩵;
    .locals 2

    .line 917
    sget-object v0, Ll/ܽۨۧ;->sRunningAnimators:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩵;

    if-nez v0, :cond_0

    .line 919
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    .line 920
    sget-object v1, Ll/ܽۨۧ;->sRunningAnimators:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public static synthetic ֫(Ll/ܽۨۧ;)Ll/ܽۨۧ;
    .locals 0

    .line 129
    iget-object p0, p0, Ll/ܽۨۧ;->mCloneParent:Ll/ܽۨۧ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܽۨۧ;Ll/ܽۨۧ;)Ll/ܽۨۧ;
    .locals 0

    .line 129
    iput-object p1, p0, Ll/ܽۨۧ;->mCloneParent:Ll/ܽۨۧ;

    return-object p1
.end method

.method private ֫(Landroid/animation/Animator;Ll/ۖ᩵;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 955
    new-instance v0, Ll/᩹ۛۧ;

    invoke-direct {v0, p0, p2}, Ll/᩹ۛۧ;-><init>(Ll/ܽۨۧ;Ll/ۖ᩵;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 967
    invoke-virtual {p0, p1}, Ll/ܽۨۧ;->animate(Landroid/animation/Animator;)V

    :cond_0
    return-void
.end method

.method private ֫(Landroid/view/View;Z)V
    .locals 5

    if-nez p1, :cond_0

    goto/16 :goto_5

    .line 1709
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 1710
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetIdExcludes:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_5

    .line 1713
    :cond_1
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetExcludes:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_5

    .line 1716
    :cond_2
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetTypeExcludes:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 1717
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    .line 1719
    iget-object v4, p0, Ll/ܽۨۧ;->mTargetTypeExcludes:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1724
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_7

    .line 1725
    new-instance v1, Ll/᩵ۨۧ;

    invoke-direct {v1, p1}, Ll/᩵ۨۧ;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_5

    .line 1727
    invoke-virtual {p0, v1}, Ll/ܽۨۧ;->captureStartValues(Ll/᩵ۨۧ;)V

    goto :goto_1

    .line 1729
    :cond_5
    invoke-virtual {p0, v1}, Ll/ܽۨۧ;->captureEndValues(Ll/᩵ۨۧ;)V

    .line 1731
    :goto_1
    iget-object v3, v1, Ll/᩵ۨۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1732
    invoke-virtual {p0, v1}, Ll/ܽۨۧ;->capturePropagationValues(Ll/᩵ۨۧ;)V

    if-eqz p2, :cond_6

    .line 1734
    iget-object v3, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    invoke-static {v3, p1, v1}, Ll/ܽۨۧ;->֫(Ll/֡ۨۧ;Landroid/view/View;Ll/᩵ۨۧ;)V

    goto :goto_2

    .line 1736
    :cond_6
    iget-object v3, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    invoke-static {v3, p1, v1}, Ll/ܽۨۧ;->֫(Ll/֡ۨۧ;Landroid/view/View;Ll/᩵ۨۧ;)V

    .line 1739
    :cond_7
    :goto_2
    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_c

    .line 1741
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetIdChildExcludes:Ljava/util/ArrayList;

    if-eqz v1, :cond_8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_5

    .line 1744
    :cond_8
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetChildExcludes:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_5

    .line 1747
    :cond_9
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypeChildExcludes:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    .line 1748
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v0, :cond_b

    .line 1750
    iget-object v3, p0, Ll/ܽۨۧ;->mTargetTypeChildExcludes:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 1755
    :cond_b
    check-cast p1, Landroid/view/ViewGroup;

    .line 1756
    :goto_4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_c

    .line 1757
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܽۨۧ;->֫(Landroid/view/View;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_c
    :goto_5
    return-void
.end method

.method public static ֫(Ll/֡ۨۧ;Landroid/view/View;Ll/᩵ۨۧ;)V
    .locals 4

    .line 1639
    iget-object v0, p0, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    iget-object v1, p0, Ll/֡ۨۧ;->ܽ:Ll/ۖ᩵;

    iget-object v2, p0, Ll/֡ۨۧ;->֫:Landroid/util/SparseArray;

    iget-object p0, p0, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    invoke-virtual {v0, p1, p2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1640
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x0

    if-ltz p2, :cond_1

    .line 1642
    invoke-virtual {v2, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v3

    if-ltz v3, :cond_0

    .line 1644
    invoke-virtual {v2, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 1646
    :cond_0
    invoke-virtual {v2, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1649
    :cond_1
    :goto_0
    invoke-static {p1}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 1651
    invoke-virtual {v1, p2}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1653
    invoke-virtual {v1, p2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1655
    :cond_2
    invoke-virtual {v1, p2, p1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1658
    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/ListView;

    if-eqz p2, :cond_5

    .line 1659
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    .line 1660
    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1661
    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v1

    .line 1662
    invoke-virtual {p2, v1}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    move-result-wide v1

    .line 1663
    invoke-virtual {p0, v1, v2}, Ll/ۚ᩵;->֫(J)I

    move-result p2

    if-ltz p2, :cond_4

    .line 109
    invoke-virtual {p0, v1, v2, v0}, Ll/ۚ᩵;->ۧ(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object p1

    .line 1665
    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_5

    const/4 p2, 0x0

    .line 1667
    invoke-virtual {p1, p2}, Landroid/view/View;->setHasTransientState(Z)V

    .line 1668
    invoke-virtual {p0, v1, v2, v0}, Ll/ۚ᩵;->֫(JLjava/lang/Object;)V

    return-void

    :cond_4
    const/4 p2, 0x1

    .line 1671
    invoke-virtual {p1, p2}, Landroid/view/View;->setHasTransientState(Z)V

    .line 1672
    invoke-virtual {p0, v1, v2, p1}, Ll/ۚ᩵;->֫(JLjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method private ֫(Ll/֡ۨۧ;Ll/֡ۨۧ;)V
    .locals 5

    .line 718
    new-instance v0, Ll/ۖ᩵;

    iget-object v1, p1, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    invoke-direct {v0, v1}, Ll/ۖ᩵;-><init>(Ll/ۖ᩵;)V

    .line 719
    new-instance v1, Ll/ۖ᩵;

    iget-object v2, p2, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    invoke-direct {v1, v2}, Ll/ۖ᩵;-><init>(Ll/ۖ᩵;)V

    const/4 v2, 0x0

    .line 722
    :goto_0
    iget-object v3, p0, Ll/ܽۨۧ;->mMatchOrder:[I

    array-length v4, v3

    if-ge v2, v4, :cond_4

    .line 723
    aget v3, v3, v2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    goto :goto_1

    .line 736
    :cond_0
    iget-object v3, p1, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    iget-object v4, p2, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    invoke-direct {p0, v0, v1, v3, v4}, Ll/ܽۨۧ;->֫(Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۚ᩵;Ll/ۚ᩵;)V

    goto :goto_1

    .line 732
    :cond_1
    iget-object v3, p1, Ll/֡ۨۧ;->֫:Landroid/util/SparseArray;

    iget-object v4, p2, Ll/֡ۨۧ;->֫:Landroid/util/SparseArray;

    invoke-direct {p0, v0, v1, v3, v4}, Ll/ܽۨۧ;->֫(Ll/ۖ᩵;Ll/ۖ᩵;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    goto :goto_1

    .line 728
    :cond_2
    iget-object v3, p1, Ll/֡ۨۧ;->ܽ:Ll/ۖ᩵;

    iget-object v4, p2, Ll/֡ۨۧ;->ܽ:Ll/ۖ᩵;

    invoke-direct {p0, v0, v1, v3, v4}, Ll/ܽۨۧ;->֫(Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;)V

    goto :goto_1

    .line 725
    :cond_3
    invoke-direct {p0, v0, v1}, Ll/ܽۨۧ;->ۧ(Ll/ۖ᩵;Ll/ۖ᩵;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 741
    :cond_4
    invoke-direct {p0, v0, v1}, Ll/ܽۨۧ;->֫(Ll/ۖ᩵;Ll/ۖ᩵;)V

    return-void
.end method

.method private ֫(Ll/ۖ᩵;Ll/ۖ᩵;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 698
    :goto_0
    invoke-virtual {p1}, Ll/ۗ᩵;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_1

    .line 699
    invoke-virtual {p1, v1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ۨۧ;

    .line 700
    iget-object v4, v2, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p0, v4}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 701
    iget-object v4, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 702
    iget-object v2, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 707
    :cond_1
    :goto_1
    invoke-virtual {p2}, Ll/ۗ᩵;->size()I

    move-result p1

    if-ge v0, p1, :cond_3

    .line 708
    invoke-virtual {p2, v0}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۨۧ;

    .line 709
    iget-object v1, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p0, v1}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 710
    iget-object v1, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    iget-object p1, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private ֫(Ll/ۖ᩵;Ll/ۖ᩵;Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .locals 7

    .line 645
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 647
    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    .line 648
    invoke-virtual {p0, v2}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 649
    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    .line 650
    invoke-virtual {p0, v3}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 369
    invoke-virtual {p1, v2, v4}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 651
    check-cast v5, Ll/᩵ۨۧ;

    .line 369
    invoke-virtual {p2, v3, v4}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 652
    check-cast v4, Ll/᩵ۨۧ;

    if-eqz v5, :cond_0

    if-eqz v4, :cond_0

    .line 654
    iget-object v6, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 655
    iget-object v5, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    invoke-virtual {p1, v2}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    invoke-virtual {p2, v3}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫(Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;)V
    .locals 7

    .line 672
    invoke-virtual {p3}, Ll/ۗ᩵;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 674
    invoke-virtual {p3, v1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    .line 675
    invoke-virtual {p0, v2}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 676
    invoke-virtual {p3, v1}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    .line 369
    invoke-virtual {p4, v3, v4}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 676
    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    .line 677
    invoke-virtual {p0, v3}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 369
    invoke-virtual {p1, v2, v4}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 678
    check-cast v5, Ll/᩵ۨۧ;

    .line 369
    invoke-virtual {p2, v3, v4}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 679
    check-cast v4, Ll/᩵ۨۧ;

    if-eqz v5, :cond_0

    if-eqz v4, :cond_0

    .line 681
    iget-object v6, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    iget-object v5, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 683
    invoke-virtual {p1, v2}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 684
    invoke-virtual {p2, v3}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫(Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۚ᩵;Ll/ۚ᩵;)V
    .locals 7

    .line 618
    invoke-virtual {p3}, Ll/ۚ᩵;->ܽ()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 620
    invoke-virtual {p3, v1}, Ll/ۚ᩵;->ᩳ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    .line 621
    invoke-virtual {p0, v2}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 622
    invoke-virtual {p3, v1}, Ll/ۚ᩵;->֫(I)J

    move-result-wide v3

    const/4 v5, 0x0

    .line 109
    invoke-virtual {p4, v3, v4, v5}, Ll/ۚ᩵;->ۧ(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object v3

    .line 622
    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    .line 623
    invoke-virtual {p0, v3}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 369
    invoke-virtual {p1, v2, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 624
    check-cast v4, Ll/᩵ۨۧ;

    .line 369
    invoke-virtual {p2, v3, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 625
    check-cast v5, Ll/᩵ۨۧ;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    .line 627
    iget-object v6, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 628
    iget-object v4, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    invoke-virtual {p1, v2}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    invoke-virtual {p2, v3}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫(Ll/ܽۨۧ;Ll/ۧۨۧ;Z)V
    .locals 5

    .line 2365
    iget-object v0, p0, Ll/ܽۨۧ;->mCloneParent:Ll/ܽۨۧ;

    if-eqz v0, :cond_0

    .line 2366
    invoke-direct {v0, p1, p2, p3}, Ll/ܽۨۧ;->֫(Ll/ܽۨۧ;Ll/ۧۨۧ;Z)V

    .line 2368
    :cond_0
    iget-object v0, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2370
    iget-object v0, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 2371
    iget-object v1, p0, Ll/ܽۨۧ;->mListenersCache:[Ll/ۛۛۧ;

    if-nez v1, :cond_1

    .line 2372
    new-array v1, v0, [Ll/ۛۛۧ;

    :cond_1
    const/4 v2, 0x0

    .line 2373
    iput-object v2, p0, Ll/ܽۨۧ;->mListenersCache:[Ll/ۛۛۧ;

    .line 2374
    iget-object v3, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ۛۛۧ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 2376
    aget-object v4, v1, v3

    invoke-interface {p2, v4, p1, p3}, Ll/ۧۨۧ;->֫(Ll/ۛۛۧ;Ll/ܽۨۧ;Z)V

    .line 2377
    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 2379
    :cond_2
    iput-object v1, p0, Ll/ܽۨۧ;->mListenersCache:[Ll/ۛۛۧ;

    :cond_3
    return-void
.end method

.method public static ֫(I)Z
    .locals 2

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    const/4 v1, 0x4

    if-gt p0, v1, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/᩵ۨۧ;Ll/᩵ۨۧ;Ljava/lang/String;)Z
    .locals 0

    .line 1985
    iget-object p0, p0, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 1986
    iget-object p1, p1, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p2, 0x1

    if-eqz p0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    .line 1996
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, p2

    return p0

    :cond_2
    :goto_0
    return p2
.end method

.method public static ֫([II)Z
    .locals 4

    .line 582
    aget v0, p0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    .line 584
    aget v3, p0, v2

    if-ne v3, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static ֫(Ljava/lang/String;)[I
    .locals 6

    .line 329
    new-instance v0, Ljava/util/StringTokenizer;

    const-string v1, ","

    invoke-direct {v0, p0, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->countTokens()I

    move-result p0

    new-array p0, p0, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 333
    :goto_0
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 334
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v4, "id"

    .line 335
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    const/4 v3, 0x3

    .line 336
    aput v3, p0, v2

    goto :goto_1

    :cond_0
    const-string v4, "instance"

    .line 337
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 338
    aput v5, p0, v2

    goto :goto_1

    :cond_1
    const-string v4, "name"

    .line 339
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v3, 0x2

    .line 340
    aput v3, p0, v2

    goto :goto_1

    :cond_2
    const-string v4, "itemId"

    .line 341
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v3, 0x4

    .line 342
    aput v3, p0, v2

    goto :goto_1

    .line 343
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 345
    array-length v3, p0

    sub-int/2addr v3, v5

    new-array v3, v3, [I

    .line 346
    invoke-static {p0, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v2, -0x1

    move-object p0, v3

    :goto_1
    add-int/2addr v2, v5

    goto :goto_0

    .line 350
    :cond_4
    new-instance p0, Landroid/view/InflateException;

    const-string v0, "Unknown match type in matchOrder: \'"

    const-string v1, "\'"

    .line 0
    invoke-static {v0, v3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 350
    invoke-direct {p0, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    return-object p0
.end method

.method private ۧ(Ll/ۖ᩵;Ll/ۖ᩵;)V
    .locals 4

    .line 597
    invoke-virtual {p1}, Ll/ۗ᩵;->size()I

    move-result v0

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 598
    invoke-virtual {p1, v0}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    .line 599
    invoke-virtual {p0, v1}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 600
    invoke-virtual {p2, v1}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۨۧ;

    if-eqz v1, :cond_0

    .line 601
    iget-object v2, v1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p0, v2}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 602
    invoke-virtual {p1, v0}, Ll/ۗ᩵;->ܿ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ۨۧ;

    .line 603
    iget-object v3, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    iget-object v2, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;
    .locals 1

    .line 2139
    iget-object v0, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 2140
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    .line 2142
    :cond_0
    iget-object v0, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addTarget(I)Ll/ܽۨۧ;
    .locals 1

    if-eqz p1, :cond_0

    .line 1118
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public addTarget(Landroid/view/View;)Ll/ܽۨۧ;
    .locals 1

    .line 1093
    iget-object v0, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addTarget(Ljava/lang/Class;)Ll/ܽۨۧ;
    .locals 1

    .line 1172
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    .line 1175
    :cond_0
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addTarget(Ljava/lang/String;)Ll/ܽۨۧ;
    .locals 1

    .line 1142
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    .line 1145
    :cond_0
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public animate(Landroid/animation/Animator;)V
    .locals 5

    if-nez p1, :cond_0

    .line 2018
    invoke-virtual {p0}, Ll/ܽۨۧ;->end()V

    return-void

    .line 2020
    :cond_0
    invoke-virtual {p0}, Ll/ܽۨۧ;->getDuration()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 2021
    invoke-virtual {p0}, Ll/ܽۨۧ;->getDuration()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 2023
    :cond_1
    invoke-virtual {p0}, Ll/ܽۨۧ;->getStartDelay()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    .line 2024
    invoke-virtual {p0}, Ll/ܽۨۧ;->getStartDelay()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v2

    add-long/2addr v2, v0

    invoke-virtual {p1, v2, v3}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 2026
    :cond_2
    invoke-virtual {p0}, Ll/ܽۨۧ;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2027
    invoke-virtual {p0}, Ll/ܽۨۧ;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 2029
    :cond_3
    new-instance v0, Ll/᩶ۛۧ;

    invoke-direct {v0, p0}, Ll/᩶ۛۧ;-><init>(Ll/ܽۨۧ;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 2036
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method public cancel()V
    .locals 4

    .line 2117
    iget-object v0, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 2118
    iget-object v1, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/animation/Animator;

    .line 2119
    sget-object v2, Ll/ܽۨۧ;->EMPTY_ANIMATOR_ARRAY:[Landroid/animation/Animator;

    iput-object v2, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 2121
    aget-object v2, v1, v0

    const/4 v3, 0x0

    .line 2122
    aput-object v3, v1, v0

    .line 2123
    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    goto :goto_0

    .line 2125
    :cond_0
    iput-object v1, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    .line 2126
    sget-object v0, Ll/ۧۨۧ;->֫:Ll/ܰۛۧ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    return-void
.end method

.method public abstract captureEndValues(Ll/᩵ۨۧ;)V
.end method

.method public capturePropagationValues(Ll/᩵ۨۧ;)V
    .locals 0

    return-void
.end method

.method public abstract captureStartValues(Ll/᩵ۨۧ;)V
.end method

.method public captureValues(Landroid/view/ViewGroup;Z)V
    .locals 5

    .line 1578
    invoke-virtual {p0, p2}, Ll/ܽۨۧ;->clearValues(Z)V

    .line 1579
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    iget-object v0, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    :cond_0
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1580
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 1581
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 1618
    :cond_2
    invoke-direct {p0, p1, p2}, Ll/ܽۨۧ;->֫(Landroid/view/View;Z)V

    goto/16 :goto_7

    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 1582
    :goto_1
    iget-object v2, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_7

    .line 1583
    iget-object v2, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 1584
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 1586
    new-instance v3, Ll/᩵ۨۧ;

    invoke-direct {v3, v2}, Ll/᩵ۨۧ;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_4

    .line 1588
    invoke-virtual {p0, v3}, Ll/ܽۨۧ;->captureStartValues(Ll/᩵ۨۧ;)V

    goto :goto_2

    .line 1590
    :cond_4
    invoke-virtual {p0, v3}, Ll/ܽۨۧ;->captureEndValues(Ll/᩵ۨۧ;)V

    .line 1592
    :goto_2
    iget-object v4, v3, Ll/᩵ۨۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1593
    invoke-virtual {p0, v3}, Ll/ܽۨۧ;->capturePropagationValues(Ll/᩵ۨۧ;)V

    if-eqz p2, :cond_5

    .line 1595
    iget-object v4, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    invoke-static {v4, v2, v3}, Ll/ܽۨۧ;->֫(Ll/֡ۨۧ;Landroid/view/View;Ll/᩵ۨۧ;)V

    goto :goto_3

    .line 1597
    :cond_5
    iget-object v4, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    invoke-static {v4, v2, v3}, Ll/ܽۨۧ;->֫(Ll/֡ۨۧ;Landroid/view/View;Ll/᩵ۨۧ;)V

    :cond_6
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    .line 1601
    :goto_4
    iget-object v0, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_a

    .line 1602
    iget-object v0, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 1603
    new-instance v2, Ll/᩵ۨۧ;

    invoke-direct {v2, v0}, Ll/᩵ۨۧ;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_8

    .line 1605
    invoke-virtual {p0, v2}, Ll/ܽۨۧ;->captureStartValues(Ll/᩵ۨۧ;)V

    goto :goto_5

    .line 1607
    :cond_8
    invoke-virtual {p0, v2}, Ll/ܽۨۧ;->captureEndValues(Ll/᩵ۨۧ;)V

    .line 1609
    :goto_5
    iget-object v3, v2, Ll/᩵ۨۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1610
    invoke-virtual {p0, v2}, Ll/ܽۨۧ;->capturePropagationValues(Ll/᩵ۨۧ;)V

    if-eqz p2, :cond_9

    .line 1612
    iget-object v3, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    invoke-static {v3, v0, v2}, Ll/ܽۨۧ;->֫(Ll/֡ۨۧ;Landroid/view/View;Ll/᩵ۨۧ;)V

    goto :goto_6

    .line 1614
    :cond_9
    iget-object v3, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    invoke-static {v3, v0, v2}, Ll/ܽۨۧ;->֫(Ll/֡ۨۧ;Landroid/view/View;Ll/᩵ۨۧ;)V

    :goto_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_a
    :goto_7
    if-nez p2, :cond_d

    .line 1620
    iget-object p1, p0, Ll/ܽۨۧ;->mNameOverrides:Ll/ۖ᩵;

    if-eqz p1, :cond_d

    .line 1621
    invoke-virtual {p1}, Ll/ۗ᩵;->size()I

    move-result p1

    .line 1622
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :goto_8
    if-ge v0, p1, :cond_b

    .line 1624
    iget-object v2, p0, Ll/ܽۨۧ;->mNameOverrides:Ll/ۖ᩵;

    invoke-virtual {v2, v0}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1625
    iget-object v3, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object v3, v3, Ll/֡ۨۧ;->ܽ:Ll/ۖ᩵;

    invoke-virtual {v3, v2}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    if-ge v1, p1, :cond_d

    .line 1628
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_c

    .line 1630
    iget-object v2, p0, Ll/ܽۨۧ;->mNameOverrides:Ll/ۖ᩵;

    invoke-virtual {v2, v1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1631
    iget-object v3, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object v3, v3, Ll/֡ۨۧ;->ܽ:Ll/ۖ᩵;

    invoke-virtual {v3, v2, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_d
    return-void
.end method

.method public clearValues(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1685
    iget-object p1, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object p1, p1, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    invoke-virtual {p1}, Ll/ۗ᩵;->clear()V

    .line 1686
    iget-object p1, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object p1, p1, Ll/֡ۨۧ;->֫:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 1687
    iget-object p1, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object p1, p1, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    invoke-virtual {p1}, Ll/ۚ᩵;->֫()V

    return-void

    .line 1689
    :cond_0
    iget-object p1, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    iget-object p1, p1, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    invoke-virtual {p1}, Ll/ۗ᩵;->clear()V

    .line 1690
    iget-object p1, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    iget-object p1, p1, Ll/֡ۨۧ;->֫:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 1691
    iget-object p1, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    iget-object p1, p1, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    invoke-virtual {p1}, Ll/ۚ᩵;->֫()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 129
    invoke-virtual {p0}, Ll/ܽۨۧ;->clone()Ll/ܽۨۧ;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ll/ܽۨۧ;
    .locals 2

    .line 2321
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۨۧ;

    .line 2322
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    .line 2323
    new-instance v1, Ll/֡ۨۧ;

    invoke-direct {v1}, Ll/֡ۨۧ;-><init>()V

    iput-object v1, v0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    .line 2324
    new-instance v1, Ll/֡ۨۧ;

    invoke-direct {v1}, Ll/֡ۨۧ;-><init>()V

    iput-object v1, v0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    const/4 v1, 0x0

    .line 2325
    iput-object v1, v0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    .line 2326
    iput-object v1, v0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    .line 2327
    iput-object v1, v0, Ll/ܽۨۧ;->mSeekController:Ll/ۤۛۧ;

    .line 2328
    iput-object p0, v0, Ll/ܽۨۧ;->mCloneParent:Ll/ܽۨۧ;

    .line 2329
    iput-object v1, v0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 2332
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public createAnimator(Landroid/view/ViewGroup;Ll/᩵ۨۧ;Ll/᩵ۨۧ;)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public createAnimators(Landroid/view/ViewGroup;Ll/֡ۨۧ;Ll/֡ۨۧ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 17

    move-object/from16 v0, p0

    .line 760
    invoke-static {}, Ll/ܽۨۧ;->֫()Ll/ۖ᩵;

    move-result-object v1

    .line 762
    new-instance v2, Landroid/util/SparseIntArray;

    invoke-direct {v2}, Landroid/util/SparseIntArray;-><init>()V

    .line 763
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 764
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getRootTransition()Ll/ܽۨۧ;

    move-result-object v4

    iget-object v4, v4, Ll/ܽۨۧ;->mSeekController:Ll/ۤۛۧ;

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x0

    if-ge v5, v3, :cond_f

    move-object/from16 v7, p4

    .line 766
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩵ۨۧ;

    move-object/from16 v9, p5

    .line 767
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩵ۨۧ;

    if-eqz v8, :cond_1

    .line 768
    iget-object v11, v8, Ll/᩵ۨۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    move-object v8, v6

    :cond_1
    if-eqz v10, :cond_2

    .line 771
    iget-object v11, v10, Ll/᩵ۨۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    move-object v10, v6

    :cond_2
    if-nez v8, :cond_3

    if-nez v10, :cond_3

    goto :goto_2

    :cond_3
    if-eqz v8, :cond_5

    if-eqz v10, :cond_5

    .line 778
    invoke-virtual {v0, v8, v10}, Ll/ܽۨۧ;->isTransitionRequired(Ll/᩵ۨۧ;Ll/᩵ۨۧ;)Z

    move-result v11

    if-eqz v11, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object/from16 v11, p1

    goto/16 :goto_8

    :cond_5
    :goto_3
    move-object/from16 v11, p1

    .line 798
    invoke-virtual {v0, v11, v8, v10}, Ll/ܽۨۧ;->createAnimator(Landroid/view/ViewGroup;Ll/᩵ۨۧ;Ll/᩵ۨۧ;)Landroid/animation/Animator;

    move-result-object v12

    if-eqz v12, :cond_d

    if-eqz v10, :cond_a

    .line 804
    iget-object v8, v10, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    .line 805
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getTransitionProperties()[Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_9

    .line 806
    array-length v13, v10

    if-lez v13, :cond_9

    .line 807
    new-instance v13, Ll/᩵ۨۧ;

    invoke-direct {v13, v8}, Ll/᩵ۨۧ;-><init>(Landroid/view/View;)V

    move-object/from16 v14, p3

    .line 808
    iget-object v15, v14, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    .line 369
    invoke-virtual {v15, v8, v6}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 808
    check-cast v6, Ll/᩵ۨۧ;

    if-eqz v6, :cond_6

    const/4 v15, 0x0

    move/from16 p2, v3

    .line 810
    :goto_4
    array-length v3, v10

    if-ge v15, v3, :cond_7

    .line 811
    aget-object v3, v10, v15

    iget-object v7, v6, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    .line 812
    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v16, v6

    .line 811
    iget-object v6, v13, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v6, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v7, p4

    move-object/from16 v6, v16

    goto :goto_4

    :cond_6
    move/from16 p2, v3

    .line 815
    :cond_7
    invoke-virtual {v1}, Ll/ۗ᩵;->size()I

    move-result v3

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v3, :cond_b

    .line 817
    invoke-virtual {v1, v6}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/animation/Animator;

    const/4 v10, 0x0

    .line 369
    invoke-virtual {v1, v7, v10}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 818
    check-cast v7, Ll/ۙۛۧ;

    .line 819
    iget-object v10, v7, Ll/ۙۛۧ;->ᩳ:Ll/᩵ۨۧ;

    if-eqz v10, :cond_8

    iget-object v10, v7, Ll/ۙۛۧ;->ܿ:Landroid/view/View;

    if-ne v10, v8, :cond_8

    iget-object v10, v7, Ll/ۙۛۧ;->ۧ:Ljava/lang/String;

    .line 820
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    .line 821
    iget-object v7, v7, Ll/ۙۛۧ;->ᩳ:Ll/᩵ۨۧ;

    invoke-virtual {v7, v13}, Ll/᩵ۨۧ;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v3, 0x0

    move-object v12, v3

    goto :goto_7

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_9
    move-object/from16 v14, p3

    move/from16 p2, v3

    goto :goto_6

    :cond_a
    move-object/from16 v14, p3

    move/from16 p2, v3

    .line 830
    iget-object v8, v8, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    :goto_6
    const/4 v13, 0x0

    :cond_b
    :goto_7
    if-eqz v12, :cond_e

    .line 838
    new-instance v3, Ll/ۙۛۧ;

    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 839
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v7

    .line 2586
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2587
    iput-object v8, v3, Ll/ۙۛۧ;->ܿ:Landroid/view/View;

    .line 2588
    iput-object v6, v3, Ll/ۙۛۧ;->ۧ:Ljava/lang/String;

    .line 2589
    iput-object v13, v3, Ll/ۙۛۧ;->ᩳ:Ll/᩵ۨۧ;

    .line 2590
    iput-object v7, v3, Ll/ۙۛۧ;->ܳ:Landroid/view/WindowId;

    .line 2591
    iput-object v0, v3, Ll/ۙۛۧ;->ܽ:Ll/ܽۨۧ;

    .line 2592
    iput-object v12, v3, Ll/ۙۛۧ;->֫:Landroid/animation/Animator;

    if-eqz v4, :cond_c

    .line 841
    new-instance v6, Landroid/animation/AnimatorSet;

    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    .line 842
    invoke-virtual {v6, v12}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-object v12, v6

    .line 845
    :cond_c
    invoke-virtual {v1, v12, v3}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    iget-object v3, v0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_d
    :goto_8
    move-object/from16 v14, p3

    move/from16 p2, v3

    :cond_e
    :goto_9
    add-int/lit8 v5, v5, 0x1

    move/from16 v3, p2

    goto/16 :goto_1

    .line 851
    :cond_f
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->size()I

    move-result v3

    if-eqz v3, :cond_10

    const/4 v3, 0x0

    .line 852
    :goto_a
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_10

    .line 853
    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v4

    .line 854
    iget-object v5, v0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    const/4 v5, 0x0

    .line 369
    invoke-virtual {v1, v4, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 855
    check-cast v4, Ll/ۙۛۧ;

    .line 856
    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v5

    int-to-long v5, v5

    const-wide v7, 0x7fffffffffffffffL

    sub-long/2addr v5, v7

    iget-object v7, v4, Ll/ۙۛۧ;->֫:Landroid/animation/Animator;

    .line 857
    invoke-virtual {v7}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v7

    add-long/2addr v7, v5

    .line 858
    iget-object v4, v4, Ll/ۙۛۧ;->֫:Landroid/animation/Animator;

    invoke-virtual {v4, v7, v8}, Landroid/animation/Animator;->setStartDelay(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_10
    return-void
.end method

.method public createSeekController()Ll/᩷ۨۧ;
    .locals 1

    .line 538
    new-instance v0, Ll/ۤۛۧ;

    invoke-direct {v0, p0}, Ll/ۤۛۧ;-><init>(Ll/ܽۨۧ;)V

    iput-object v0, p0, Ll/ܽۨۧ;->mSeekController:Ll/ۤۛۧ;

    .line 539
    invoke-virtual {p0, v0}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    .line 540
    iget-object v0, p0, Ll/ܽۨۧ;->mSeekController:Ll/ۤۛۧ;

    return-object v0
.end method

.method public end()V
    .locals 4

    .line 2067
    iget v0, p0, Ll/ܽۨۧ;->mNumInstances:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ܽۨۧ;->mNumInstances:I

    if-nez v0, :cond_4

    .line 2069
    sget-object v0, Ll/ۧۨۧ;->ۧ:Ll/᩺ۛۧ;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    const/4 v0, 0x0

    .line 2070
    :goto_0
    iget-object v3, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object v3, v3, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    invoke-virtual {v3}, Ll/ۚ᩵;->ܽ()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 2071
    iget-object v3, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object v3, v3, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    invoke-virtual {v3, v0}, Ll/ۚ᩵;->ᩳ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    .line 2073
    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 2076
    :goto_1
    iget-object v3, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    iget-object v3, v3, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    invoke-virtual {v3}, Ll/ۚ᩵;->ܽ()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 2077
    iget-object v3, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    iget-object v3, v3, Ll/֡ۨۧ;->ۧ:Ll/ۚ᩵;

    invoke-virtual {v3, v0}, Ll/ۚ᩵;->ᩳ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_2

    .line 2079
    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2082
    :cond_3
    iput-boolean v1, p0, Ll/ܽۨۧ;->mEnded:Z

    :cond_4
    return-void
.end method

.method public excludeChildren(IZ)Ll/ܽۨۧ;
    .locals 1

    .line 1394
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetIdChildExcludes:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1, p2}, Ll/ܽۨۧ;->֫(Ljava/util/ArrayList;IZ)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۨۧ;->mTargetIdChildExcludes:Ljava/util/ArrayList;

    return-object p0
.end method

.method public excludeChildren(Landroid/view/View;Z)Ll/ܽۨۧ;
    .locals 1

    .line 1364
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetChildExcludes:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1, p2}, Ll/ܽۨۧ;->֫(Ljava/util/ArrayList;Landroid/view/View;Z)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۨۧ;->mTargetChildExcludes:Ljava/util/ArrayList;

    return-object p0
.end method

.method public excludeChildren(Ljava/lang/Class;Z)Ll/ܽۨۧ;
    .locals 1

    .line 1477
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypeChildExcludes:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1, p2}, Ll/ܽۨۧ;->֫(Ljava/util/ArrayList;Ljava/lang/Class;Z)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۨۧ;->mTargetTypeChildExcludes:Ljava/util/ArrayList;

    return-object p0
.end method

.method public excludeTarget(IZ)Ll/ܽۨۧ;
    .locals 1

    .line 1312
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetIdExcludes:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1, p2}, Ll/ܽۨۧ;->֫(Ljava/util/ArrayList;IZ)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۨۧ;->mTargetIdExcludes:Ljava/util/ArrayList;

    return-object p0
.end method

.method public excludeTarget(Landroid/view/View;Z)Ll/ܽۨۧ;
    .locals 1

    .line 1286
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetExcludes:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1, p2}, Ll/ܽۨۧ;->֫(Ljava/util/ArrayList;Landroid/view/View;Z)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۨۧ;->mTargetExcludes:Ljava/util/ArrayList;

    return-object p0
.end method

.method public excludeTarget(Ljava/lang/Class;Z)Ll/ܽۨۧ;
    .locals 1

    .line 1450
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypeExcludes:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1, p2}, Ll/ܽۨۧ;->֫(Ljava/util/ArrayList;Ljava/lang/Class;Z)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۨۧ;->mTargetTypeExcludes:Ljava/util/ArrayList;

    return-object p0
.end method

.method public excludeTarget(Ljava/lang/String;Z)Ll/ܽۨۧ;
    .locals 1

    .line 1338
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetNameExcludes:Ljava/util/ArrayList;

    invoke-static {v0, p1, p2}, Ll/ܽۨۧ;->֫(Ljava/util/ArrayList;Ljava/lang/Object;Z)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۨۧ;->mTargetNameExcludes:Ljava/util/ArrayList;

    return-object p0
.end method

.method public forceToEnd(Landroid/view/ViewGroup;)V
    .locals 4

    .line 2092
    invoke-static {}, Ll/ܽۨۧ;->֫()Ll/ۖ᩵;

    move-result-object v0

    .line 2093
    invoke-virtual {v0}, Ll/ۗ᩵;->size()I

    move-result v1

    if-eqz p1, :cond_2

    if-nez v1, :cond_0

    goto :goto_1

    .line 2098
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object p1

    .line 2099
    new-instance v2, Ll/ۖ᩵;

    invoke-direct {v2, v0}, Ll/ۖ᩵;-><init>(Ll/ۖ᩵;)V

    .line 2100
    invoke-virtual {v0}, Ll/ۗ᩵;->clear()V

    :cond_1
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 2103
    invoke-virtual {v2, v1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۛۧ;

    .line 2104
    iget-object v3, v0, Ll/ۙۛۧ;->ܿ:Landroid/view/View;

    if-eqz v3, :cond_1

    iget-object v0, v0, Ll/ۙۛۧ;->ܳ:Landroid/view/WindowId;

    invoke-virtual {p1, v0}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2105
    invoke-virtual {v2, v1}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator;

    .line 2106
    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public getDuration()J
    .locals 2

    .line 394
    iget-wide v0, p0, Ll/ܽۨۧ;->mDuration:J

    return-wide v0
.end method

.method public getEpicenter()Landroid/graphics/Rect;
    .locals 1

    .line 2245
    iget-object v0, p0, Ll/ܽۨۧ;->mEpicenterCallback:Ll/۬ۛۧ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2248
    :cond_0
    invoke-virtual {v0}, Ll/۬ۛۧ;->֫()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public getEpicenterCallback()Ll/۬ۛۧ;
    .locals 1

    .line 2232
    iget-object v0, p0, Ll/ܽۨۧ;->mEpicenterCallback:Ll/۬ۛۧ;

    return-object v0
.end method

.method public getInterpolator()Landroid/animation/TimeInterpolator;
    .locals 1

    .line 449
    iget-object v0, p0, Ll/ܽۨۧ;->mInterpolator:Landroid/animation/TimeInterpolator;

    return-object v0
.end method

.method public getMatchedTransitionValues(Landroid/view/View;Z)Ll/᩵ۨۧ;
    .locals 5

    .line 1789
    iget-object v0, p0, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    if-eqz v0, :cond_0

    .line 1790
    invoke-virtual {v0, p1, p2}, Ll/ܽۨۧ;->getMatchedTransitionValues(Landroid/view/View;Z)Ll/᩵ۨۧ;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    .line 1792
    iget-object v0, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_2

    return-object v1

    .line 1796
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    .line 1799
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵ۨۧ;

    if-nez v4, :cond_3

    return-object v1

    .line 1804
    :cond_3
    iget-object v4, v4, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    if-ne v4, p1, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    const/4 v3, -0x1

    :goto_2
    if-ltz v3, :cond_7

    if-eqz p2, :cond_6

    .line 1811
    iget-object p1, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    goto :goto_3

    :cond_6
    iget-object p1, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    .line 1812
    :goto_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۨۧ;

    return-object p1

    :cond_7
    return-object v1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 2350
    iget-object v0, p0, Ll/ܽۨۧ;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public getPathMotion()Ll/֡ۛۧ;
    .locals 1

    .line 2202
    iget-object v0, p0, Ll/ܽۨۧ;->mPathMotion:Ll/֡ۛۧ;

    return-object v0
.end method

.method public getPropagation()Ll/ۜۨۧ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRootTransition()Ll/ܽۨۧ;
    .locals 1

    .line 364
    iget-object v0, p0, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    if-eqz v0, :cond_0

    .line 365
    invoke-virtual {v0}, Ll/ܽۨۧ;->getRootTransition()Ll/ܽۨۧ;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public getStartDelay()J
    .locals 2

    .line 421
    iget-wide v0, p0, Ll/ܽۨۧ;->mStartDelay:J

    return-wide v0
.end method

.method public getTargetIds()Ljava/util/List;
    .locals 1

    .line 1508
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getTargetNames()Ljava/util/List;
    .locals 1

    .line 1537
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getTargetTypes()Ljava/util/List;
    .locals 1

    .line 1552
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getTargets()Ljava/util/List;
    .locals 1

    .line 1522
    iget-object v0, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getTotalDurationMillis()J
    .locals 2

    .line 2388
    iget-wide v0, p0, Ll/ܽۨۧ;->mTotalDuration:J

    return-wide v0
.end method

.method public getTransitionProperties()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTransitionValues(Landroid/view/View;Z)Ll/᩵ۨۧ;
    .locals 1

    .line 1770
    iget-object v0, p0, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    if-eqz v0, :cond_0

    .line 1771
    invoke-virtual {v0, p1, p2}, Ll/ܽۨۧ;->getTransitionValues(Landroid/view/View;Z)Ll/᩵ۨۧ;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    .line 1773
    iget-object p2, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    .line 1774
    :goto_0
    iget-object p2, p2, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    const/4 v0, 0x0

    .line 369
    invoke-virtual {p2, p1, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1774
    check-cast p1, Ll/᩵ۨۧ;

    return-object p1
.end method

.method public hasAnimators()Z
    .locals 1

    .line 1871
    iget-object v0, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isSeekingSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isTransitionRequired(Ll/᩵ۨۧ;Ll/᩵ۨۧ;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 1963
    invoke-virtual {p0}, Ll/ܽۨۧ;->getTransitionProperties()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1965
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    .line 1966
    invoke-static {p1, p2, v4}, Ll/ܽۨۧ;->֫(Ll/᩵ۨۧ;Ll/᩵ۨۧ;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1972
    :cond_1
    iget-object v1, p1, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1973
    invoke-static {p1, p2, v2}, Ll/ܽۨۧ;->֫(Ll/᩵ۨۧ;Ll/᩵ۨۧ;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    return v0
.end method

.method public isValidTarget(Landroid/view/View;)Z
    .locals 5

    .line 874
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 875
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetIdExcludes:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    .line 878
    :cond_0
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetExcludes:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    .line 881
    :cond_1
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetTypeExcludes:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    .line 882
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 884
    iget-object v4, p0, Ll/ܽۨۧ;->mTargetTypeExcludes:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    .line 885
    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 890
    :cond_3
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetNameExcludes:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    invoke-static {p1}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 891
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetNameExcludes:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v2

    .line 895
    :cond_4
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_7

    iget-object v1, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    .line 896
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_5
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    if-eqz v1, :cond_6

    .line 897
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    return v3

    .line 900
    :cond_7
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_2

    .line 903
    :cond_8
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    invoke-static {p1}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return v3

    .line 906
    :cond_9
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    .line 907
    :goto_1
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_b

    .line 908
    iget-object v1, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    return v3

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_b
    return v2

    :cond_c
    :goto_2
    return v3
.end method

.method public notifyListeners(Ll/ۧۨۧ;Z)V
    .locals 0

    .line 2357
    invoke-direct {p0, p0, p1, p2}, Ll/ܽۨۧ;->֫(Ll/ܽۨۧ;Ll/ۧۨۧ;Z)V

    return-void
.end method

.method public pause(Landroid/view/View;)V
    .locals 4

    .line 1825
    iget-boolean p1, p0, Ll/ܽۨۧ;->mEnded:Z

    if-nez p1, :cond_1

    .line 1826
    iget-object p1, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 1827
    iget-object v0, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/Animator;

    .line 1828
    sget-object v1, Ll/ܽۨۧ;->EMPTY_ANIMATOR_ARRAY:[Landroid/animation/Animator;

    iput-object v1, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    :goto_0
    if-ltz p1, :cond_0

    .line 1830
    aget-object v2, v0, p1

    const/4 v3, 0x0

    .line 1831
    aput-object v3, v0, p1

    .line 1832
    invoke-virtual {v2}, Landroid/animation/Animator;->pause()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    .line 1834
    :cond_0
    iput-object v0, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    .line 1835
    sget-object p1, Ll/ۧۨۧ;->ܽ:Ll/۟ۛۧ;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    .line 1836
    iput-boolean v1, p0, Ll/ܽۨۧ;->mPaused:Z

    :cond_1
    return-void
.end method

.method public playTransition(Landroid/view/ViewGroup;)V
    .locals 11

    .line 1880
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    .line 1881
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    .line 1882
    iget-object v0, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object v1, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    invoke-direct {p0, v0, v1}, Ll/ܽۨۧ;->֫(Ll/֡ۨۧ;Ll/֡ۨۧ;)V

    .line 1884
    invoke-static {}, Ll/ܽۨۧ;->֫()Ll/ۖ᩵;

    move-result-object v0

    .line 1885
    invoke-virtual {v0}, Ll/ۗ᩵;->size()I

    move-result v1

    .line 1886
    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v2

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    :goto_0
    if-ltz v1, :cond_6

    .line 1888
    invoke-virtual {v0, v1}, Ll/ۗ᩵;->ܽ(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    if-eqz v4, :cond_5

    const/4 v5, 0x0

    .line 369
    invoke-virtual {v0, v4, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 1890
    check-cast v6, Ll/ۙۛۧ;

    if-eqz v6, :cond_5

    .line 1891
    iget-object v7, v6, Ll/ۙۛۧ;->ܽ:Ll/ܽۨۧ;

    iget-object v8, v6, Ll/ۙۛۧ;->ܿ:Landroid/view/View;

    if-eqz v8, :cond_5

    iget-object v9, v6, Ll/ۙۛۧ;->ܳ:Landroid/view/WindowId;

    .line 1892
    invoke-virtual {v2, v9}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 1893
    iget-object v6, v6, Ll/ۙۛۧ;->ᩳ:Ll/᩵ۨۧ;

    .line 1895
    invoke-virtual {p0, v8, v3}, Ll/ܽۨۧ;->getTransitionValues(Landroid/view/View;Z)Ll/᩵ۨۧ;

    move-result-object v9

    .line 1896
    invoke-virtual {p0, v8, v3}, Ll/ܽۨۧ;->getMatchedTransitionValues(Landroid/view/View;Z)Ll/᩵ۨۧ;

    move-result-object v10

    if-nez v9, :cond_0

    if-nez v10, :cond_0

    .line 1898
    iget-object v10, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    iget-object v10, v10, Ll/֡ۨۧ;->ᩳ:Ll/ۖ᩵;

    .line 369
    invoke-virtual {v10, v8, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 1898
    move-object v10, v5

    check-cast v10, Ll/᩵ۨۧ;

    :cond_0
    if-nez v9, :cond_1

    if-eqz v10, :cond_5

    .line 1901
    :cond_1
    invoke-virtual {v7, v6, v10}, Ll/ܽۨۧ;->isTransitionRequired(Ll/᩵ۨۧ;Ll/᩵ۨۧ;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 1904
    invoke-virtual {v7}, Ll/ܽۨۧ;->getRootTransition()Ll/ܽۨۧ;

    move-result-object v5

    iget-object v5, v5, Ll/ܽۨۧ;->mSeekController:Ll/ۤۛۧ;

    if-eqz v5, :cond_2

    .line 1907
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    .line 1908
    iget-object v5, v7, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1909
    invoke-virtual {v0, v4}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1910
    iget-object v4, v7, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_5

    .line 1911
    sget-object v4, Ll/ۧۨۧ;->֫:Ll/ܰۛۧ;

    const/4 v5, 0x0

    invoke-virtual {v7, v4, v5}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    .line 1912
    iget-boolean v4, v7, Ll/ܽۨۧ;->mEnded:Z

    if-nez v4, :cond_5

    .line 1913
    iput-boolean v3, v7, Ll/ܽۨۧ;->mEnded:Z

    .line 1914
    sget-object v4, Ll/ۧۨۧ;->ۧ:Ll/᩺ۛۧ;

    invoke-virtual {v7, v4, v5}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    goto :goto_2

    .line 1918
    :cond_2
    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    .line 1927
    :cond_3
    invoke-virtual {v0, v4}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1922
    :cond_4
    :goto_1
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_0

    .line 1934
    :cond_6
    iget-object v6, p0, Ll/ܽۨۧ;->mStartValues:Ll/֡ۨۧ;

    iget-object v7, p0, Ll/ܽۨۧ;->mEndValues:Ll/֡ۨۧ;

    iget-object v8, p0, Ll/ܽۨۧ;->mStartValuesList:Ljava/util/ArrayList;

    iget-object v9, p0, Ll/ܽۨۧ;->mEndValuesList:Ljava/util/ArrayList;

    move-object v4, p0

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Ll/ܽۨۧ;->createAnimators(Landroid/view/ViewGroup;Ll/֡ۨۧ;Ll/֡ۨۧ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1935
    iget-object p1, p0, Ll/ܽۨۧ;->mSeekController:Ll/ۤۛۧ;

    if-nez p1, :cond_7

    .line 1936
    invoke-virtual {p0}, Ll/ܽۨۧ;->runAnimators()V

    return-void

    .line 1937
    :cond_7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x22

    if-lt p1, v0, :cond_8

    .line 1938
    invoke-virtual {p0}, Ll/ܽۨۧ;->prepareAnimatorsForSeeking()V

    .line 1939
    iget-object p1, p0, Ll/ܽۨۧ;->mSeekController:Ll/ۤۛۧ;

    invoke-virtual {p1}, Ll/ۤۛۧ;->֫()V

    .line 1940
    iget-object p1, p0, Ll/ܽۨۧ;->mSeekController:Ll/ۤۛۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_8
    return-void
.end method

.method public prepareAnimatorsForSeeking()V
    .locals 10

    .line 980
    invoke-static {}, Ll/ܽۨۧ;->֫()Ll/ۖ᩵;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 982
    iput-wide v1, p0, Ll/ܽۨۧ;->mTotalDuration:J

    const/4 v3, 0x0

    .line 983
    :goto_0
    iget-object v4, p0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 984
    iget-object v4, p0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    const/4 v5, 0x0

    .line 369
    invoke-virtual {v0, v4, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 988
    check-cast v5, Ll/ۙۛۧ;

    if-eqz v4, :cond_3

    if-eqz v5, :cond_3

    .line 989
    iget-object v5, v5, Ll/ۙۛۧ;->֫:Landroid/animation/Animator;

    .line 990
    invoke-virtual {p0}, Ll/ܽۨۧ;->getDuration()J

    move-result-wide v6

    cmp-long v8, v6, v1

    if-ltz v8, :cond_0

    .line 991
    invoke-virtual {p0}, Ll/ܽۨۧ;->getDuration()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 993
    :cond_0
    invoke-virtual {p0}, Ll/ܽۨۧ;->getStartDelay()J

    move-result-wide v6

    cmp-long v8, v6, v1

    if-ltz v8, :cond_1

    .line 995
    invoke-virtual {p0}, Ll/ܽۨۧ;->getStartDelay()J

    move-result-wide v6

    invoke-virtual {v5}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v8

    add-long/2addr v8, v6

    .line 994
    invoke-virtual {v5, v8, v9}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 997
    :cond_1
    invoke-virtual {p0}, Ll/ܽۨۧ;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 998
    invoke-virtual {p0}, Ll/ܽۨۧ;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1000
    :cond_2
    iget-object v5, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1001
    iget-wide v5, p0, Ll/ܽۨۧ;->mTotalDuration:J

    invoke-static {v4}, Ll/۫ۛۧ;->֫(Landroid/animation/Animator;)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ܽۨۧ;->mTotalDuration:J

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1004
    :cond_4
    iget-object v0, p0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;
    .locals 1

    .line 2155
    iget-object v0, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2158
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܽۨۧ;->mCloneParent:Ll/ܽۨۧ;

    if-eqz v0, :cond_1

    .line 2159
    invoke-virtual {v0, p1}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    .line 2161
    :cond_1
    iget-object p1, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    .line 2162
    iput-object p1, p0, Ll/ܽۨۧ;->mListeners:Ljava/util/ArrayList;

    :cond_2
    :goto_0
    return-object p0
.end method

.method public removeTarget(I)Ll/ܽۨۧ;
    .locals 1

    if-eqz p1, :cond_0

    .line 1208
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public removeTarget(Landroid/view/View;)Ll/ܽۨۧ;
    .locals 1

    .line 1191
    iget-object v0, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public removeTarget(Ljava/lang/Class;)Ll/ܽۨۧ;
    .locals 1

    .line 1243
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetTypes:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 1244
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public removeTarget(Ljava/lang/String;)Ll/ܽۨۧ;
    .locals 1

    .line 1225
    iget-object v0, p0, Ll/ܽۨۧ;->mTargetNames:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 1226
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public resume(Landroid/view/View;)V
    .locals 4

    .line 1848
    iget-boolean p1, p0, Ll/ܽۨۧ;->mPaused:Z

    if-eqz p1, :cond_2

    .line 1849
    iget-boolean p1, p0, Ll/ܽۨۧ;->mEnded:Z

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 1850
    iget-object p1, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 1851
    iget-object v1, p0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/animation/Animator;

    .line 1852
    sget-object v2, Ll/ܽۨۧ;->EMPTY_ANIMATOR_ARRAY:[Landroid/animation/Animator;

    iput-object v2, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_0

    .line 1854
    aget-object v2, v1, p1

    const/4 v3, 0x0

    .line 1855
    aput-object v3, v1, p1

    .line 1856
    invoke-virtual {v2}, Landroid/animation/Animator;->resume()V

    goto :goto_0

    .line 1858
    :cond_0
    iput-object v1, p0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    .line 1859
    sget-object p1, Ll/ۧۨۧ;->ᩳ:Ll/֫ۨۧ;

    invoke-virtual {p0, p1, v0}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    .line 1861
    :cond_1
    iput-boolean v0, p0, Ll/ܽۨۧ;->mPaused:Z

    :cond_2
    return-void
.end method

.method public runAnimators()V
    .locals 4

    .line 935
    invoke-virtual {p0}, Ll/ܽۨۧ;->start()V

    .line 936
    invoke-static {}, Ll/ܽۨۧ;->֫()Ll/ۖ᩵;

    move-result-object v0

    .line 938
    iget-object v1, p0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    .line 942
    invoke-virtual {v0, v2}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 943
    invoke-virtual {p0}, Ll/ܽۨۧ;->start()V

    .line 944
    invoke-direct {p0, v2, v0}, Ll/ܽۨۧ;->֫(Landroid/animation/Animator;Ll/ۖ᩵;)V

    goto :goto_0

    .line 947
    :cond_1
    iget-object v0, p0, Ll/ܽۨۧ;->mAnimators:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 948
    invoke-virtual {p0}, Ll/ܽۨۧ;->end()V

    return-void
.end method

.method public setCanRemoveViews(Z)V
    .locals 0

    .line 2308
    iput-boolean p1, p0, Ll/ܽۨۧ;->mCanRemoveViews:Z

    return-void
.end method

.method public setCurrentPlayTimeMillis(JJ)V
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 2404
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getTotalDurationMillis()J

    move-result-wide v3

    const/4 v5, 0x0

    cmp-long v6, v1, p3

    if-gez v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const-wide/16 v7, 0x0

    cmp-long v9, p3, v7

    if-gez v9, :cond_1

    cmp-long v10, v1, v7

    if-gez v10, :cond_2

    :cond_1
    cmp-long v10, p3, v3

    if-lez v10, :cond_3

    cmp-long v10, v1, v3

    if-gtz v10, :cond_3

    .line 2408
    :cond_2
    iput-boolean v5, v0, Ll/ܽۨۧ;->mEnded:Z

    .line 2409
    sget-object v10, Ll/ۧۨۧ;->ܿ:Ll/ۨۛۧ;

    invoke-virtual {v0, v10, v6}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    .line 2411
    :cond_3
    iget-object v10, v0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    .line 2412
    iget-object v11, v0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    iget-object v12, v0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Landroid/animation/Animator;

    .line 2413
    sget-object v12, Ll/ܽۨۧ;->EMPTY_ANIMATOR_ARRAY:[Landroid/animation/Animator;

    iput-object v12, v0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    :goto_1
    if-ge v5, v10, :cond_4

    .line 2415
    aget-object v12, v11, v5

    const/4 v13, 0x0

    .line 2416
    aput-object v13, v11, v5

    .line 2417
    invoke-static {v12}, Ll/۫ۛۧ;->֫(Landroid/animation/Animator;)J

    move-result-wide v13

    move v15, v9

    move/from16 v16, v10

    .line 2418
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    .line 2419
    invoke-static {v12, v9, v10}, Ll/۫ۛۧ;->֫(Landroid/animation/Animator;J)V

    add-int/lit8 v5, v5, 0x1

    move v9, v15

    move/from16 v10, v16

    goto :goto_1

    :cond_4
    move v15, v9

    .line 2421
    iput-object v11, v0, Ll/ܽۨۧ;->mAnimatorCache:[Landroid/animation/Animator;

    cmp-long v5, v1, v3

    if-lez v5, :cond_5

    cmp-long v9, p3, v3

    if-lez v9, :cond_6

    :cond_5
    cmp-long v3, v1, v7

    if-gez v3, :cond_8

    if-ltz v15, :cond_8

    :cond_6
    if-lez v5, :cond_7

    const/4 v1, 0x1

    .line 2429
    iput-boolean v1, v0, Ll/ܽۨۧ;->mEnded:Z

    .line 2431
    :cond_7
    sget-object v1, Ll/ۧۨۧ;->ۧ:Ll/᩺ۛۧ;

    invoke-virtual {v0, v1, v6}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    :cond_8
    return-void
.end method

.method public setDuration(J)Ll/ܽۨۧ;
    .locals 0

    .line 381
    iput-wide p1, p0, Ll/ܽۨۧ;->mDuration:J

    return-object p0
.end method

.method public setEpicenterCallback(Ll/۬ۛۧ;)V
    .locals 0

    .line 2217
    iput-object p1, p0, Ll/ܽۨۧ;->mEpicenterCallback:Ll/۬ۛۧ;

    return-void
.end method

.method public setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ܽۨۧ;
    .locals 0

    .line 435
    iput-object p1, p0, Ll/ܽۨۧ;->mInterpolator:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method public varargs setMatchOrder([I)V
    .locals 2

    if-eqz p1, :cond_4

    .line 561
    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 564
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_3

    .line 565
    aget v1, p1, v0

    .line 566
    invoke-static {v1}, Ll/ܽۨۧ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 569
    invoke-static {p1, v0}, Ll/ܽۨۧ;->֫([II)Z

    move-result v1

    if-nez v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 570
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "matches contains a duplicate value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 567
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "matches contains invalid value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 573
    :cond_3
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Ll/ܽۨۧ;->mMatchOrder:[I

    return-void

    .line 562
    :cond_4
    :goto_1
    sget-object p1, Ll/ܽۨۧ;->DEFAULT_MATCH_ORDER:[I

    iput-object p1, p0, Ll/ܽۨۧ;->mMatchOrder:[I

    return-void
.end method

.method public setPathMotion(Ll/֡ۛۧ;)V
    .locals 0

    if-nez p1, :cond_0

    .line 2185
    sget-object p1, Ll/ܽۨۧ;->STRAIGHT_PATH_MOTION:Ll/֡ۛۧ;

    iput-object p1, p0, Ll/ܽۨۧ;->mPathMotion:Ll/֡ۛۧ;

    return-void

    .line 2187
    :cond_0
    iput-object p1, p0, Ll/ܽۨۧ;->mPathMotion:Ll/֡ۛۧ;

    return-void
.end method

.method public setPropagation(Ll/ۜۨۧ;)V
    .locals 0

    return-void
.end method

.method public setStartDelay(J)Ll/ܽۨۧ;
    .locals 0

    .line 408
    iput-wide p1, p0, Ll/ܽۨۧ;->mStartDelay:J

    return-object p0
.end method

.method public start()V
    .locals 2

    .line 2048
    iget v0, p0, Ll/ܽۨۧ;->mNumInstances:I

    if-nez v0, :cond_0

    .line 2049
    sget-object v0, Ll/ۧۨۧ;->ܿ:Ll/ۨۛۧ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    .line 2050
    iput-boolean v1, p0, Ll/ܽۨۧ;->mEnded:Z

    .line 2052
    :cond_0
    iget v0, p0, Ll/ܽۨۧ;->mNumInstances:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽۨۧ;->mNumInstances:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    .line 2314
    invoke-virtual {p0, v0}, Ll/ܽۨۧ;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 2436
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2437
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "@"

    .line 2438
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2439
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    .line 2440
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2441
    iget-wide v1, p0, Ll/ܽۨۧ;->mDuration:J

    const-string p1, ") "

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const-string v1, "dur("

    .line 2442
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ܽۨۧ;->mDuration:J

    .line 2443
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2444
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2446
    :cond_0
    iget-wide v1, p0, Ll/ܽۨۧ;->mStartDelay:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    const-string v1, "dly("

    .line 2447
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ܽۨۧ;->mStartDelay:J

    .line 2448
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2449
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2451
    :cond_1
    iget-object v1, p0, Ll/ܽۨۧ;->mInterpolator:Landroid/animation/TimeInterpolator;

    if-eqz v1, :cond_2

    const-string v1, "interp("

    .line 2452
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܽۨۧ;->mInterpolator:Landroid/animation/TimeInterpolator;

    .line 2453
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2454
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2456
    :cond_2
    iget-object p1, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-gtz p1, :cond_3

    iget-object p1, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_8

    :cond_3
    const-string p1, "tgts("

    .line 2457
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2458
    iget-object p1, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const-string v1, ", "

    const/4 v2, 0x0

    if-lez p1, :cond_5

    const/4 p1, 0x0

    .line 2459
    :goto_0
    iget-object v3, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge p1, v3, :cond_5

    if-lez p1, :cond_4

    .line 2461
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2463
    :cond_4
    iget-object v3, p0, Ll/ܽۨۧ;->mTargetIds:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 2466
    :cond_5
    iget-object p1, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_7

    .line 2467
    :goto_1
    iget-object p1, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_7

    if-lez v2, :cond_6

    .line 2469
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2471
    :cond_6
    iget-object p1, p0, Ll/ܽۨۧ;->mTargets:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    const-string p1, ")"

    .line 2474
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2476
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
